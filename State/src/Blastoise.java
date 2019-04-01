
public class Blastoise implements PokemonState{

	private Pokemon pokemon;
	
	public Blastoise(Pokemon pokemon) {
		pokemon = pokemon;
	}
	
	@Override
	public void kehity() {
		System.out.println("En voi enää kehittyä enempää");
	}

	@Override
	public void isku1() {
		System.out.println("\nOlen nyt kehittyneimmässä muodossani eli olen Blastoise\nOsaan muun muassa:\n");
		System.out.println("Vesitykki");
		
	}

	@Override
	public void isku2() {
		System.out.println("Liiskaa");
		
	}

	@Override
	public void isku3() {
		System.out.println("Tuhoa\n----------------------");
		
	}

}
