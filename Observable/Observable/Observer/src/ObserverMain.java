
public class ObserverMain {
	
	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		DigitalClock clock = new DigitalClock(timer);  
		Thread clockThread = new Thread(timer);  
		clockThread.start();  		 
	}
}
