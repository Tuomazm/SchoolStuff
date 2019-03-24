
public class Farkut implements Vaate {
	
	private String[] brändi;
	
	public Farkut(String valmistaja) {
		this.brändi = valmistaja.split("F");
	}

	public String toString() {
		return this.brändi[0] + " farkut";
	}
}
