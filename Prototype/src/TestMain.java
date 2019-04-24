
public class TestMain {

	public static void main(String[] args) {
		
		Clock clock = new Clock(0,0,0);
		Clock clock2 = clock.clone();
		clock.startClock();
		clock2.startClock();
		
		
	}

}
