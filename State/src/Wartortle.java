
public class Wartortle implements PokemonState{

	private Pokemon pokemon;
	
	public Wartortle(Pokemon pokemon) {
		pokemon = pokemon;		
	}
	
	@Override
	public void kehity() {}


	@Override
	public void isku1() {
		System.out.println("\nOlen nyt Wartortle ja osaan:\n");
		System.out.println("Vedenalainen hyökkäys");
		
	}

	@Override
	public void isku2() {
		System.out.println("Lyö");
		
	}

	@Override
	public void isku3() {
		System.out.println("Vesisuihku\n-------------------");
		
	}

}
