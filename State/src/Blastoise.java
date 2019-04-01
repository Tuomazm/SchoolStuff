
public class Blastoise extends PokemonState {

	@Override
	public void kehity(Pokemon pokemon) {
		System.out.println("En voi enää kehittyä enempää");
	}

	@Override
	public void isku1() {
		System.out.println("Ampua vesitykillä");
	}

	@Override
	public void isku2() {
		System.out.println("Liiskata");
	}

	@Override
	public void isku3() {
		System.out.println("Tuhota");
	}
	
	public String getInfo() {
		return "Kehityin Wartortlesta Blastoiseksi ja osaan:\n";
	}
}
