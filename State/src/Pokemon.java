
public class Pokemon {

	private PokemonState nykyinenTila;

	public Pokemon() {
		nykyinenTila = new Squirtle();
	}

	public void kehity() {
		nykyinenTila.kehity(this);
	}

	public void muutaTila(PokemonState uusiTila) {
		nykyinenTila = uusiTila;
	}

	public void isku1() {
		nykyinenTila.isku1();
	}

	public void isku2() {
		nykyinenTila.isku2();
	}

	public void isku3() {
		nykyinenTila.isku3();
	}

	public void getInfo() {
		System.out.println("Olen " + nykyinenTila.getClass().getName() + " ja osaan:\n");
	}
}
