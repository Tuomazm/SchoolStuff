import java.util.ArrayList;
import java.util.Collections;

public class Lottonumerot {

	private static Lottonumerot lottonrot = null;
	private ArrayList<Integer> numerot = new ArrayList<>(); 
		
	private Lottonumerot() {
		for(int i = 1; i<40; i++) {
			numerot.add(i);
		}
	}
	
	public static Lottonumerot getInstance() {
		
		if(lottonrot == null) {
			lottonrot = new Lottonumerot();
		}
		
		return lottonrot;
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
