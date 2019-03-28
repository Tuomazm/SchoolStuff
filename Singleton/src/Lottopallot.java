import java.util.ArrayList;
import java.util.Collections;

public class Lottopallot {

	private static Lottopallot lottonpallot = null;
	private ArrayList<Integer> numerot = new ArrayList<>(); 
		
	private Lottopallot() {
		for(int i = 1; i<40; i++) {
			numerot.add(i);
		}
	}
	
	public static synchronized Lottopallot getInstance() {
		
		if(lottonpallot == null) {
			lottonpallot = new Lottopallot();
		}
		
		return lottonpallot;
	}
	
	public ArrayList<Integer> arvoNumerot(){
		
		Collections.shuffle(numerot);
		ArrayList<Integer> arvotutNumerot = new ArrayList<>();
		
		for(int i = 0; i < 7 ; i++) {
			arvotutNumerot.add(numerot.get(i));
		}
		Collections.sort(arvotutNumerot);
		
		return arvotutNumerot;
	}
}
