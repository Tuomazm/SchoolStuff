
public class TestPokemon {

	public static void main(String[] args) {

		Pokemon poke = new Pokemon();

		for (int i = 0; i < 3; i++) {
			poke.getInfo();
			poke.isku1();
			poke.isku2();
			poke.isku3();
			System.out.println("\n----------------\n");
			poke.kehity();
		}
	}
}
