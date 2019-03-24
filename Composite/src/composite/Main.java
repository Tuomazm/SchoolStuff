package composite;

public class Main {

	public static void main(String[] args) {

		System.out.println("Fujitsun kone:");
		AbstractFactory fujitsu = new FujitsuFactory();
		Tietokone kone1 = fujitsu.kasaaTietokone();
		System.out.println("Tietokoneen kokonaishinta: " + kone1.getHinta() + "€");

		System.out.println("\nAcerin kone:");
		AbstractFactory acer = new AcerFactory();
		Tietokone kone2 = acer.kasaaTietokone();
		System.out.println("Tietokoneen kokonaishinta: " + kone2.getHinta() + "€");
	}
}
