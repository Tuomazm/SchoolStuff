
public class AdidasFactory extends AbstractFactory {

	@Override
	public Vaate createTuote(String tuote, String valmistaja) {
		if (tuote.equalsIgnoreCase("lippis")) {
			return new Lippis(valmistaja);
		} else if (tuote.equalsIgnoreCase("farkut")) {
			return new Farkut(valmistaja);
		} else if (tuote.equalsIgnoreCase("kengät")) {
			return new Kengät(valmistaja);
		} else if (tuote.equalsIgnoreCase("t-paita")) {
			return new Paita(valmistaja);
		}

		System.out.println("Tuotetta " + tuote + " ei löydy valikoimasta.");
		return null;
	}
}