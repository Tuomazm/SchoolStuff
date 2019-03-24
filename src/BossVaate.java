
public class BossVaate implements Vaate {

	private String tuotetyyppi;
	
	public BossVaate(String tuotetyyppi) {
		this.tuotetyyppi = tuotetyyppi;
	}

	public String toString() {
		return "Boss " + tuotetyyppi;
	}
}
