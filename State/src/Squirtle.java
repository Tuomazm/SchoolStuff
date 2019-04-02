
public class Squirtle implements PokemonState {
	
	public Squirtle() {}
	
	@Override
	public void kehity(Pokemon pokemon) {
		pokemon.muutaTila(new Wartortle());
	}
	
	@Override
	public void isku1() {
		System.out.println("Puskea");		
	}

	@Override
	public void isku2() {		
		System.out.println("Töniä");
	}

	@Override
	public void isku3() {
		System.out.println("Uhota");		
	}
}	
