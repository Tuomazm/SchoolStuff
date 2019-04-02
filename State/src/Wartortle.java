
public class Wartortle implements PokemonState{
	
	public Wartortle() {}
	
	@Override
	public void kehity(Pokemon pokemon) {
		pokemon.muutaTila(new Blastoise());
	}

	@Override
	public void isku1() {
		System.out.println("Vedenalaisen hyökkäyksen");		
	}

	@Override
	public void isku2() {
		System.out.println("Lyödä");		
	}

	@Override
	public void isku3() {
		System.out.println("Vesisuihkun");		
	}
}
