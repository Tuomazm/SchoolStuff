import java.util.ArrayList;
import java.util.Iterator;

//Kaksi säiettä, yksi iteraattori

public class B implements ThreadIterator{
	
	private ArrayList<Integer> ints;
	private Iterator iter;
	
	public B(ArrayList<Integer> ints) {
		this.ints = ints;
		this.iter = createIterator();
	}

	public void runThread1() {
		
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
	
	public void runThread2() {
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
			System.out.println("Value from iterator is " + iter.next());
		}
	}


	@Override
	public Iterator createIterator() {
		return ints.iterator();
	}

}
