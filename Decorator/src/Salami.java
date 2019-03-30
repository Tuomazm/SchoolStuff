
public class Salami extends TäyteDecorator {

	public Salami(Pizza uusiPizza) {
		super(uusiPizza);
	}

	public double getHinta() {
		return työnAllaOlevaPizza.getHinta() + 1.25;
	}

	public String toString() {
		return työnAllaOlevaPizza.toString() + ", salami";
	}

}
