package de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces;

/**
 * Template implementation of the matcher interface.
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractMatcher implements IMatcher {
	private String name = "";
	private String description = "";
	
	public AbstractMatcher(String name , String description) {
		setName(name);
		setDescription(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return getName();
	}



}
