package composite;

import java.util.List;

public class Verkkokortti implements Laiteosa {

	private double hinta;
	
	public Verkkokortti(double hinta) {
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		
	}

	@Override
	public List<Laiteosa> getLaiteosat() {
		return null;
	}

	@Override
	public String toString() {
		return "verkkokortti";
	}

}
