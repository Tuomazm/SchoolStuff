import java.util.ArrayList;
import java.util.Iterator;

//Muutoksia iteroinnin aikana, aiheuttaa ConcurrentModificationException

public class C implements ThreadIterator{

	private ArrayList<Integer> ints;
	private Iterator iter;
	private int value;
	
	public C (ArrayList<Integer> ints) {
		this.ints = ints;
		this.iter = createIterator();
	}

	public void runThread() {
		
		new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                iterate();
            }
        }).start();
	}
	
	private void iterate() {
		
		if (iter.hasNext()) {
			value = (int) iter.next();
			System.out.println("Value from iterator is " + value);
			if (value == 5) {
				ints.add(100000000);
			}
		}	
	}

	@Override
	public Iterator createIterator() {
		return ints.iterator();
	}

}