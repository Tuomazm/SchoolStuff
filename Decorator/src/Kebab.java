public class Kebab extends TäyteDecorator{
	
	public Kebab(Pizza uusiPizza) {
		super(uusiPizza);
	}
	
	public double getHinta() {
		return työnAllaOlevaPizza.getHinta() + 1.50;
	}
	
	public String toString() {
		return työnAllaOlevaPizza.toString() + ", kebab";
	}

}