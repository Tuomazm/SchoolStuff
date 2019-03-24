
public class Lippis implements Vaate {
	
	private String[] brändi;
	
	public Lippis(String valmistaja) {
		this.brändi = valmistaja.split("F");
	}

	public String toString() {
		return this.brändi[0] + " lippis";
	}

}
