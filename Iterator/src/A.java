import java.util.ArrayList;
import java.util.Iterator;

//Kaksi säiettä, molemmilla oma iteraattori

public class A implements ThreadIterator{

	private ArrayList<Integer> ints;
	private Iterator ite1;
	private Iterator ite2;
	
	public A(ArrayList<Integer> ints) {
		this.ints = ints;
		this.ite1 = createIterator();
		this.ite2 = createIterator();
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
