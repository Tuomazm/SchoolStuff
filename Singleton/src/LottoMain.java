
public class LottoMain {

	public static void main(String[] args) {

		Lottokone lottokone = new Lottokone();
		Thread lottoThread = new Thread(lottokone);
		lottoThread.start();
	}
}
