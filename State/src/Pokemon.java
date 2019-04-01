
public class Pokemon {
	
	private PokemonState squirtle;
	private PokemonState wartortle;
	private PokemonState blastoise;
	private PokemonState pokemonState;
	
	public Pokemon() {
		squirtle = new Squirtle(this);
		wartortle = new Wartortle(this);
		blastoise = new Blastoise(this);
		pokemonState = squirtle;
	}
	
	public void kehity() {
		if(pokemonState == squirtle) {
			squirtle.kehity();
		}else if(pokemonState == wartortle) {
			pokemonState = blastoise;
		}else {
			System.out.println("Error");
		}
		
		
	}
	
	public void isku1() {
		pokemonState.isku1();
	}
	
	public void isku2() {
		pokemonState.isku2();
	}
	
	public void isku3() {
		pokemonState.isku3();
	}

}

