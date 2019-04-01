
public class Squirtle extends PokemonState {
	
	@Override
	public void kehity(Pokemon pokemon) {
		super.muutaTila(pokemon, new Wartortle());
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
	
	public String getInfo() {
		return "Olen uusi Squirtle ja osaan:\n"; 
	}
}	
