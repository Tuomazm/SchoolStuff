
public class Squirtle implements PokemonState {

	private Pokemon pokemon;
	
	public Squirtle(Pokemon uusiPokemon) {
		pokemon = uusiPokemon;
		System.out.println("Uusi Squirtle luotu\n\nOsaan seuraavat iskut:");
	}
	
	@Override
	public void kehity() {

	}

	@Override
	public void isku1() {
		System.out.println("Puske");
		
	}

	@Override
	public void isku2() {		
		System.out.println("Sylje");
	}

	@Override
	public void isku3() {
		System.out.println("Juokse karkuun\n---------------");
		
	}

}	
