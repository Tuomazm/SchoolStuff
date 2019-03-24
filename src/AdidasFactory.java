
public class AdidasFactory implements AbstractFactory {

	@Override
	public Vaate createVaate(String tuotetyyppi) {
		return new AdidasVaate(tuotetyyppi);
	}
}
