
public abstract class TäyteDecorator implements Pizza {

	protected Pizza työnAllaOlevaPizza;
	
	public TäyteDecorator(Pizza uusiPizza) {
		this.työnAllaOlevaPizza = uusiPizza;
	}
	
	public double getHinta() {
		return työnAllaOlevaPizza.getHinta();
	}

}
