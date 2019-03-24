package composite;

import java.util.List;

public class Prosessori implements Laiteosa {

	private double hinta;
	
	public Prosessori(double hinta) {
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
		return "prosessori";
	}

}
