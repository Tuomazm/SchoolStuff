
public class AdidasVaate implements Vaate {

	private String tuotetyyppi;
	
	public AdidasVaate(String tuotetyyppi) {
		this.tuotetyyppi = tuotetyyppi;
	}

	public String toString() {
		return "Adidas " + tuotetyyppi;
	}
}