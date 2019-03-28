import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ClockTimer extends Observable implements Runnable{

	private int hour;
	private int minute;
	private int second;
	private List<Observer> observers;
	
	public ClockTimer() {
		this.observers = new ArrayList<>(); 
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		System.out.println("Clock is starting!\n\nHH:MM:SS\n");
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
			tick();
		}	
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	void tick() {
		updateClock();
		for(Observer o : observers) {
			o.update(this, o);
		}
	}
	
	private void updateClock() {
		second++;
		if(second > 59) {
			minute++;
			second = 0;
		}
		if(minute > 59) {
			hour++;
			minute = 0;
		}
	}

}
