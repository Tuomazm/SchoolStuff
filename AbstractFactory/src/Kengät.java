
public class Kengät implements Vaate{
	
	private String[] brändi;
	
	public Kengät(String valmistaja) {
		this.brändi = valmistaja.split("F");
	}

	public String toString() {
		return this.brändi[0] + " kengät";
	}
}	
