public class Kinkku extends TäyteDecorator {
	
	public Kinkku(Pizza uusiPizza) {
		super(uusiPizza);
	}
	
	public double getHinta() {
		return työnAllaOlevaPizza.getHinta() + 1.00;
	}
	
	public String toString() {
		return työnAllaOlevaPizza.toString() + ", kinkku";
	}

}