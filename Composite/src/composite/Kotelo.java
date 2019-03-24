package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

	private double hinta;
	private List<Laiteosa> kotelonOsat;
	
	public Kotelo(double hinta) {
		this.hinta = hinta;
		this.kotelonOsat = new ArrayList<>();
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		kotelonOsat.add(osa);
	}

	@Override
	public List<Laiteosa> getLaiteosat() {
		return kotelonOsat;
	}

	@Override
	public String toString() {
		return "kotelo";
	}

}
