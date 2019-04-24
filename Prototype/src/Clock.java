import java.util.Random;

public class Clock implements Cloneable {

	private Pointer hours;
	private Pointer minutes;
	private Pointer seconds;
	private Random rand;

	public Clock(int hrs, int mins, int sec) {
		this.rand = new Random();
		this.hours = new Pointer(23);
		this.minutes = new Pointer(59);
		this.seconds = new Pointer(59);
		this.hours.setValue(hrs);
		this.minutes.setValue(mins);
		this.seconds.setValue(sec);
	}

	public void startClock() {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tick();
			}
		}).start();
	}

	@Override
	public Clock clone() {		
		Clock clone = null;
		int secs = rand.nextInt(60);
		int mins = rand.nextInt(60);
		int hrs = rand.nextInt(24);
		clone = new Clock(this.hours.getValue() + hrs , this.minutes.getValue() + mins , this.seconds.getValue() + secs);
		return clone;
	}

	private void tick() {
		seconds.next();
		if (seconds.getValue() == 0) {
			minutes.next();
			if (minutes.getValue() == 0) {
				hours.next();
			}
		}
		System.out.println(toString());
	}

	public String toString() {
		return hours.toString() + ":" + minutes.toString() + ":" + seconds.toString();
	}

}