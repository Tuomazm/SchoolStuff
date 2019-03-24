package composite;

import java.util.ArrayList;
import java.util.List;

public class Tietokone {

	private List<Laiteosa> osat;
	
	public Tietokone() {
		this.osat = new ArrayList<>();
	}

	public double getHinta() {
		return this.osat.stream().mapToDouble(Laiteosa::getHinta).sum();
	}

	public void addLaiteosa(Laiteosa osa) {
		this.osat.add(osa);
		
	}

	public List<Laiteosa> getLaiteosat() {
		return this.osat;
	}
}
