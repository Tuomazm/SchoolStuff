package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

	private double hinta;
	private List<Laiteosa> emolevynOsat;
	
	public Emolevy(double hinta) {
		this.hinta = hinta;
		this.emolevynOsat = new ArrayList<>();
	}
	
	@Override
	public double getHinta() {
		double liitettyjenKompHinta = emolevynOsat.stream()
				.mapToDouble(Laiteosa::getHinta).sum();
		return hinta + liitettyjenKompHinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		emolevynOsat.add(osa);
	}

	@Override
	public List<Laiteosa> getLaiteosat() {
		return emolevynOsat;
	}

	@Override
	public String toString() {
		return "emolevy";
	}
}
