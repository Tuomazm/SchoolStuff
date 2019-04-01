
public class Wartortle extends PokemonState{
	
	@Override
	public void kehity(Pokemon pokemon) {
		super.muutaTila(pokemon, new Blastoise());
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
	
	public String getInfo() {
		return "Kehityin Squirtlesta Wartortleksi ja osaan:\n"; 
	}
}
