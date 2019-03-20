package factorymethod;

public class Talonmies extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		return new Vaapukkamehu();
	}
	
}
