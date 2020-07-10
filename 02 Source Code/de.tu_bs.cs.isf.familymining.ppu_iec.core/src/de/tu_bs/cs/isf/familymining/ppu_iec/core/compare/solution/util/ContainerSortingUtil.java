package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util;

import java.util.List;
import java.util.stream.Collectors;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.DiagramElementImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.FBDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;

public class ContainerSortingUtil {
	
	public static List<STImplContainer> sortST(List<?> containers) {
		List<STImplContainer> stImplList = containers
				.stream()
			    .map(e -> (STImplContainer) e)
			    .collect(Collectors.toList());
		stImplList.sort((firstContainer, secondContainer) -> {	
			
			int firstContFirstLine = getLine(firstContainer.getFirst());
			int firstContSecondLine = getLine(firstContainer.getSecond());
			int secondContFirstLine = getLine(secondContainer.getFirst());
			int secondContSecondLine = getLine(secondContainer.getSecond());
			
			
			int firstContainerMinLine = Math.min(firstContFirstLine, firstContSecondLine);
			int secondContainerMinLine = Math.min(secondContFirstLine, secondContSecondLine);
			
			int compareResult = Integer.compare(firstContainerMinLine, secondContainerMinLine);
			
			if(compareResult == 0) {
				int firstContainerMaxLine = Math.max(firstContFirstLine, firstContSecondLine);
				int secondContainerMaxLine = Math.max(secondContFirstLine, secondContSecondLine);
				return -Integer.compare(firstContainerMaxLine, secondContainerMaxLine);
			}
	
			return compareResult;
		});
		return stImplList;
	}

	/**
	 * This method sorts SFC container by step level.
	 */
	public static List<SFCImplContainer> sortSFC(List<?> containers) {
		List<SFCImplContainer> sfcImplList = containers
				.stream()
			    .map(e -> (SFCImplContainer) e)
			    .collect(Collectors.toList());
		sfcImplList.sort((firstContainer, secondContainer) -> {
			
			int firstContFirstStepLevel      = -1;
			int firstContSecondStepLevel     = -1;
			int secondContFirstStepLevel     = -1;
			int secondContSecondStepLevel    = -1;
			
			int firstContainerLevel = 0;
			int secondContainerLevel = 0;
			
			if(firstContainer.getFirst() != null) {
				firstContFirstStepLevel      = firstContainer.getFirst().getStepLevel();
			}
			
			if(firstContainer.getSecond() != null) {
				firstContSecondStepLevel     = firstContainer.getSecond().getStepLevel();
			}
			
			if(secondContainer.getFirst() != null) {
				secondContFirstStepLevel     = secondContainer.getFirst().getStepLevel();
			}

			if(secondContainer.getSecond() != null) {
				secondContSecondStepLevel    = secondContainer.getSecond().getStepLevel();
			}

			
			if(firstContFirstStepLevel == -1) {
				firstContainerLevel = firstContSecondStepLevel;
			} else if(firstContSecondStepLevel == -1){
				firstContainerLevel = firstContFirstStepLevel;
			} else {
				firstContainerLevel = Math.min(firstContFirstStepLevel, firstContSecondStepLevel);
			}
			
			if(secondContFirstStepLevel == -1) {
				secondContainerLevel = secondContSecondStepLevel;
			} else if(secondContSecondStepLevel == -1){
				secondContainerLevel = secondContFirstStepLevel;
			} else {
				secondContainerLevel = Math.min(secondContFirstStepLevel, secondContSecondStepLevel);
			}
			
			int compareResult = Integer.compare(firstContainerLevel, secondContainerLevel);
			
			
			return compareResult;
		});
		
		
		
		return sfcImplList;
	}
	
	/**
	 * This method sorts LDNetworkElements.
	 */
	public static List<DiagramElementImplContainer> sortLDElements(List<?> containers) {
		List<DiagramElementImplContainer> ldImplList = containers
				.stream()
			    .map(e -> (DiagramElementImplContainer) e)
			    .collect(Collectors.toList());
			ldImplList.sort((firstContainer, secondContainer) -> {
				
				int firstContFirstStepLevel      = -1;
				int firstContSecondStepLevel     = -1;
				int secondContFirstStepLevel     = -1;
				int secondContSecondStepLevel    = -1;
				
				int firstContainerLevel = 0;
				int secondContainerLevel = 0;
				
				if(firstContainer.getFirst() != null) {
					firstContFirstStepLevel      = firstContainer.getFirst().getLevel();
				}
				
				if(firstContainer.getSecond() != null) {
					firstContSecondStepLevel     = firstContainer.getSecond().getLevel();
				}
				
				if(secondContainer.getFirst() != null) {
					secondContFirstStepLevel     = secondContainer.getFirst().getLevel();
				}

				if(secondContainer.getSecond() != null) {
					secondContSecondStepLevel    = secondContainer.getSecond().getLevel();
				}

				
				if(firstContFirstStepLevel == -1) {
					firstContainerLevel = firstContSecondStepLevel;
				} else if(firstContSecondStepLevel == -1){
					firstContainerLevel = firstContFirstStepLevel;
				} else {
					firstContainerLevel = Math.min(firstContFirstStepLevel, firstContSecondStepLevel);
				}
				
				if(secondContFirstStepLevel == -1) {
					secondContainerLevel = secondContSecondStepLevel;
				} else if(secondContSecondStepLevel == -1){
					secondContainerLevel = secondContFirstStepLevel;
				} else {
					secondContainerLevel = Math.min(secondContFirstStepLevel, secondContSecondStepLevel);
				}
				
				int compareResult = Integer.compare(firstContainerLevel, secondContainerLevel);
				
				
				return compareResult;
			});

		return ldImplList;
	}
	
	public static List<FBDNetworkImplContainer> sortFBD(List<?> containers) {
		List<FBDNetworkImplContainer> ldImplList = containers
				.stream()
			    .map(e -> (FBDNetworkImplContainer) e)
			    .collect(Collectors.toList());
		
		
		return ldImplList;
		
	}
	
	public static List<DiagramElementImplContainer> sortFBDElements(List<?> containers) {
		List<DiagramElementImplContainer> ldImplList = containers
				.stream()
			    .map(e -> (DiagramElementImplContainer) e)
			    .collect(Collectors.toList());
		ldImplList.sort((firstContainer, secondContainer) -> {
					int firstContFirstStepLevel      = -1;
					int firstContSecondStepLevel     = -1;
					int secondContFirstStepLevel     = -1;
					int secondContSecondStepLevel    = -1;
					
					int firstContainerLevel = 0;
					int secondContainerLevel = 0;
					
					if(firstContainer.getFirst() != null) {
						firstContFirstStepLevel      = firstContainer.getFirst().getLevel();
					}
					
					if(firstContainer.getSecond() != null) {
						firstContSecondStepLevel     = firstContainer.getSecond().getLevel();
					}
					
					if(secondContainer.getFirst() != null) {
						secondContFirstStepLevel     = secondContainer.getFirst().getLevel();
					}
	
					if(secondContainer.getSecond() != null) {
						secondContSecondStepLevel    = secondContainer.getSecond().getLevel();
					}
	
					
					if(firstContFirstStepLevel == -1) {
						firstContainerLevel = firstContSecondStepLevel;
					} else if(firstContSecondStepLevel == -1){
						firstContainerLevel = firstContFirstStepLevel;
					} else {
						firstContainerLevel = Math.min(firstContFirstStepLevel, firstContSecondStepLevel);
					}
					
					if(secondContFirstStepLevel == -1) {
						secondContainerLevel = secondContSecondStepLevel;
					} else if(secondContSecondStepLevel == -1){
						secondContainerLevel = secondContFirstStepLevel;
					} else {
						secondContainerLevel = Math.min(secondContFirstStepLevel, secondContSecondStepLevel);
					}
					
					int compareResult = Integer.compare(firstContainerLevel, secondContainerLevel);

					return compareResult;
				});
			
		
		return ldImplList;
		
	}
	
	
	
	public static List<LDNetworkImplContainer> sortLD(List<?> containers) {
		List<LDNetworkImplContainer> ldImplList = containers
				.stream()
			    .map(e -> (LDNetworkImplContainer) e)
			    .collect(Collectors.toList());
		return ldImplList;
	}
	
	static private int getLine(Statement statement) {
		return statement != null ? statement.getRelStartLine() : Integer.MAX_VALUE;		
	}
}
