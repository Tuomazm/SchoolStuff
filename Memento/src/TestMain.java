public class TestMain {

	public static void main(String[] args) {

		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas pelaaja = new Asiakas();
		arvuuttaja.liityPeliin(pelaaja);
		int i = 1;
		boolean oikeinArvattu = false;

		while (!oikeinArvattu) {
			if (arvuuttaja.arvaaLuku(pelaaja, i) == true) {
				oikeinArvattu = true;
			}
			i++;
		}
	}
}
