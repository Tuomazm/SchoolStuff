
public class TestMain {

	public static void main(String[] args) {

		Clock clock = new Clock();
		Clock clock2 = clock.clone();
		clock2.raffleTime();
		clock.startClock();
		clock2.startClock();

	}
}
