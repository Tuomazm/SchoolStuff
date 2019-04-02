
public class Pokemon {

	private PokemonState tila;

	public Pokemon() {
		tila = new Squirtle();
	}
	
	public void muutaTila(PokemonState uusiTila) {
		tila = uusiTila;
	}

	public void kehity() {
		tila.kehity(this);
	}

	public void isku1() {
		tila.isku1();
	}

	public void isku2() {
		tila.isku2();
	}

	public void isku3() {
		tila.isku3();
	}

	public void getInfo() {
		System.out.println("Olen " + tila.getClass().getName() + " ja osaan:\n");
	}
}
