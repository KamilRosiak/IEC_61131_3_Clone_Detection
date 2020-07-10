package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.CompareEngine;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.AbstractMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;

public class ProjectCompareUtil {

	
	/**
	 * This method compares a List of POUs pairwise and creates a upper matrix.
	 */
	public static List<POUCompareContainer> comparePOUs(List<POU> pous, MetricContainer metric, AbstractMatcher matcher){
		List<POUCompareContainer> result = new ArrayList<POUCompareContainer>();
		CompareEngine compareEngine = new CompareEngine(metric);
		for(int i = 0 ; i < pous.size() ; i++) {
			for(int j = i ; j < pous.size() ; j++) {
				POUCompareContainer pouCompareContainer = compareEngine.comparePOUs(pous.get(i), pous.get(j), metric);
				pouCompareContainer.updateSimilarity();
				matcher.matchPOUOContainer(pouCompareContainer);
				pouCompareContainer.updateSimilarity();
				result.add(pouCompareContainer);
			}
		}	
		
		return result;
	}
	/**
	 * This method creates a CSV-File with all comparison details if status is true.
	 */
	public static void createCSV(List<POUCompareContainer> results, String fileName) {
		String name = RCPContentProvider.getCurrentWorkspacePath() + E4CStringTable.MODEL_DIRECTORY+ "/"+ fileName +"."+E4CStringTable.FILE_ENDING_CSV;
		Map<POU,Integer> nameMap = new HashMap<POU, Integer>();
		int counter = 0;
		
		List<String> nameList = new ArrayList<String>();
		 // Creates a map between pous and a integer value that servers as indices for the matrix.
		for(POUCompareContainer container : results) {
			if(!nameMap.containsKey(container.getFirst())) {
				nameMap.put(container.getFirst(), counter);
				
				nameList.add(container.getFirst().getIdentifier());
				counter++;
			}
		}
		float[][] similarityArray = new float[nameMap.size()][nameMap.size()];
		//fills the similarity array with available values
		for(POUCompareContainer container : results) {
			similarityArray[nameMap.get(container.getFirst())][nameMap.get(container.getSecond())] = container.getSimilarity();
		}
		
		
		try (PrintWriter writer = new PrintWriter(new File(name))) {
			StringBuilder sb = new StringBuilder();
			sb.append(";");
			
			for(String pouName : nameList) {
				sb.append(pouName + ";");
			}
			
			for(int i = 0 ; i < nameMap.size(); i++) {
				sb.append('\n');
				sb.append(nameList.get(i) + ";");
				for(int k = 0 ; k < i ; k++) {
					sb.append(";");
				}
				for(int j = i ; j < nameMap.size() ; j++) {
					if(similarityArray[i][j] == 0.0) {
						sb.append(";");
					} else {
						sb.append(similarityArray[i][j] + ";");
					}
				}
			}
			
			
			writer.append(sb.toString());
	

		} catch (IOException e) {
			RCPMessageProvider.errorMessage("File accsess error" , "Could not write file "+ fileName);
			}
	}	
	
	public static void findGroups(List<POUCompareContainer> results) {
		List<Set<POU>> groups = new ArrayList<Set<POU>>();

		boolean isContained = false;
		for(POUCompareContainer container : results) {
			for(Set<POU> set : groups) {
				if(set.contains(container.getFirst())) {
					set.add(container.getSecond());
					set.addAll(getAllSimilarPOUs(results, container.getSecond()));
					isContained = true;
				}
				if(set.contains(container.getSecond())) {
					set.add(container.getFirst());
					set.addAll(getAllSimilarPOUs(results, container.getFirst()));
					isContained = true;
				}
			}

			if(isContained == false) {
				HashSet<POU> pouSet = new HashSet<POU>();
				pouSet.add(container.getFirst());
				pouSet.add(container.getSecond());
				groups.add(pouSet);
			}
			isContained = false;

		}
		
		printPOUSet(groups);
	}
	
	/**
	 * This method returns all similar elements
	 */
	public static Set<POU> getAllSimilarPOUs(List<POUCompareContainer> results, POU pou) {
		HashSet<POU> pouSet = new HashSet<POU>();
		
		for(POUCompareContainer container : results) {
			if(container.getFirst().equals(pou) || container.getSecond().equals(pou)) {
				pouSet.add(container.getFirst());
				pouSet.add(container.getSecond());
			}
		}
		
		return pouSet;
	}

	public static void printPOUSet(List<Set<POU>> groups) {
		int groupCounter = 0;
		for(Set<POU> group : groups) {
			System.out.println("Group "+groupCounter+": ");
			groupCounter++;
			for(POU pou : group) {
				System.out.print(pou.getIdentifier()+" ,");
			}
			System.out.println();
			
		}
	}
}
