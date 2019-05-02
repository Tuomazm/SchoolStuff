import java.util.ArrayList;
import java.util.Iterator;

//Yksi säie, kaksi iteraattoria

public class D implements ThreadIterator{

	private ArrayList<Integer> ints;
	private Iterator ite1;
	private Iterator ite2;
	
	public D(ArrayList<Integer> ints) {
		this.ints = ints;
		this.ite1 = createIterator();
		this.ite2 = createIterator();
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
                iterate2();
            }
        }).start();
	}
		
	private void iterate() {
		
		if (ite1.hasNext()) {
			System.out.println("Value from ite1 is " + ite1.next());
		}
	}
	
	private void iterate2() {
		
		if (ite2.hasNext()) {
			System.out.println("Value from ite2 is " + ite2.next());
		}
	}
	
	@Override
	public Iterator createIterator() {
		return ints.iterator();
	}

}
