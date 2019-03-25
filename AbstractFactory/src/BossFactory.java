
public class BossFactory extends AbstractFactory {

	@Override
	public Vaate createLippis(String valmistaja) {
		return new Lippis(valmistaja);
	}

	@Override
	public Vaate createFarkut(String valmistaja) {
		return new Farkut(valmistaja);
	}

	@Override
	public Vaate createPaita(String valmistaja) {
		return new Paita(valmistaja);
	}

	@Override
	public Vaate createKengät(String valmistaja) {
		return new Kengät(valmistaja);
	}


}
