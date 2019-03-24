
public class BossFactory implements AbstractFactory {

	@Override
	public Vaate createVaate(String tuotetyyppi) {
		return new BossVaate(tuotetyyppi);
	}


}
