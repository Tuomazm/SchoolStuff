
public class Paita implements Vaate{

	private String[] brändi;
	
	public Paita(String valmistaja) {
		this.brändi = valmistaja.split("F");
	}

	public String toString() {
		return this.brändi[0] + " t-paita";
	}
}
