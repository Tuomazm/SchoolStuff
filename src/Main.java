
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Opiskeluaikana pukeuduin seuraaviin vaatteisiin:\n");
		
		Jasper jasper = new Jasper(new AdidasFactory());
		jasper.luoVaatekerrasto();
		jasper.luetteleVaatteet();
		
		System.out.println("\nKun rahaa alkoi sataa, päivitin vaatekaapin seuraaviin vaatteisiin:\n");
		jasper.setTehdas(new BossFactory());
		jasper.luoVaatekerrasto();
		jasper.luetteleVaatteet();
		
	}

}
