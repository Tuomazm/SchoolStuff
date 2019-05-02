import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> ints = new ArrayList<>();
		
		for(int i = 0; i <= 10; i++) {
			ints.add(i);
		}
		/*
		A a = new A(ints);
		System.out.println("Values from A:");
		a.runThread1();
		a.runThread2();
		 */
		/*
		B b = new B(ints);
		System.out.println("Values from B:");
		b.runThread1();
		b.runThread2();
		*/
		/*
		C c = new C(ints);
		System.out.println("Values from C:");
		c.runThread();
		*/
		D d = new D(ints);
		System.out.println("Values from D:");
		d.runThread();
	}

}
