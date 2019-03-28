
public class Lottokone implements Runnable {

	private int vk = 1;
	private Lottonumerot ln;

	public Lottokone() {
		ln = Lottonumerot.getInstance();
	}

	@Override
	public void run() {

		while (true) {
			try {
				System.out.println("Arvonta numero " + vk + ", 7 oikein tulos:\n" + ln.arvoNumerot() + "\n");
				vk++;
				System.out.println("Seuraava arvonta viiden sekunnin kuluttua.\n");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Häikkä lottokoneessa.");
			}
		}

	}

}
