import java.util.Random;

public class Clock implements Cloneable {

	private Pointer hours;
	private Pointer minutes;
	private Pointer seconds;
	private Random rand;

	public Clock() {
		this.rand = new Random();
		this.hours = new Pointer(23);
		this.minutes = new Pointer(59);
		this.seconds = new Pointer(59);
		raffleTime();
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
		
		Clock clonedClock = null;
		try {
			clonedClock = (Clock) super.clone();
			clonedClock.hours = (Pointer)hours.clone();
			clonedClock.minutes = (Pointer)minutes.clone();
			clonedClock.seconds = (Pointer)seconds.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedClock;
	}
	
	public void raffleTime() {
		this.hours.setValue(rand.nextInt(24));
		this.minutes.setValue(rand.nextInt(60));
		this.seconds.setValue(rand.nextInt(60));
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