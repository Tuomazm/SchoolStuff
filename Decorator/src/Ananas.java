
public class Ananas extends TäyteDecorator{
	
	public Ananas(Pizza uusiPizza) {
		super(uusiPizza);
	}
	
	public double getHinta() {
		return työnAllaOlevaPizza.getHinta() + 0.75;
	}
	
	public String toString() {
		return työnAllaOlevaPizza.toString() + ", ananas";
	}

}
