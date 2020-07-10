package de.tu_bs.cs.isf.familymining.ppu_iec.core.util;

public class Pair<T1, T2> {
	private T1 _first;
	private T2 _second;
	
	public Pair(T1 first,T2 second) {
		setFirst(first);
		setSecond(second);
	}

	public T1 getFirst() {
		return _first;
	}

	public void setFirst(T1 _first) {
		this._first = _first;
	}


	public T2 getSecond() {
		return _second;
	}


	public void setSecond(T2 _second) {
		this._second = _second;
	}
	
	@SuppressWarnings("rawtypes")
	public boolean equals(Pair pair) {
		if ((pair.getFirst().equals(_first) && pair.getSecond().equals(_second)) || 
				(pair.getFirst().equals(_second) && pair.getSecond().equals(_first))
			) {
			return true;
		}		
		return false;
	}
}
