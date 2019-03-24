package composite;

import java.util.List;

public class Muistipiiri implements Laiteosa {

	private double hinta;
	
	public Muistipiiri(double hinta) {
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
		return "muistipiiri";
	}

}
