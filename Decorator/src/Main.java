
public class Main {

	public static void main(String[] args) {
		
		Pizza ananasKebu = new Juusto(new Ananas(new Kebab(new Pizzapohja())));
		Pizza ananasKinkku = new Juusto(new Ananas(new Kinkku(new Pizzapohja())));
		Pizza salamiKinkku = new Juusto(new Kinkku(new Salami(new Pizzapohja())));

		System.out.println("PIZZERIAN MENU:\n-------------------\n");
		System.out.println("1. Ananas-kebab\nSisältää: "+ ananasKebu.toString() + "\nHinta: " + ananasKebu.getHinta() + " €\n");
		System.out.println("2. Ananas-kinkku\nSisältää: "+ ananasKinkku.toString() + "\nHinta: " + ananasKinkku.getHinta() + " €\n");
		System.out.println("3. Salami-kinkku\nSisältää: "+ salamiKinkku.toString() + "\nHinta: " + salamiKinkku.getHinta() + " €\n");
	
	}

}
