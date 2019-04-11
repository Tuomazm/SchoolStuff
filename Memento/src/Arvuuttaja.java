import java.util.Random;

public class Arvuuttaja {

	private Random random;
	private static Arvuuttaja arvuuttaja;

	public Arvuuttaja() {
		random = new Random();
	}

	public static synchronized Arvuuttaja getInstance() {
		if (arvuuttaja == null) {
			arvuuttaja = new Arvuuttaja();
		}
		return arvuuttaja;
	}

	public void liityPeliin(Asiakas asiakas) {
		asiakas.setMemento(new Memento(random.nextInt(10) + 1));
	}

	public boolean arvaaLuku(Asiakas asiakas, int arvaus) {
		Memento memento = (Memento) asiakas.getMemento();
		if (arvaus == memento.getLuku()) {
			System.out.println("Pelaaja arvasi oikein! Oikea vastaus: " + arvaus);
			return true;
		} else {
			System.out.println("Pelaaja arvasi väärin arvatessaan: " + arvaus);
		}
		return false;
	}

	private class Memento {

		private int luku;

		public Memento(int luku) {
			this.luku = luku;
		}

		public int getLuku() {
			return luku;
		}
	}
}