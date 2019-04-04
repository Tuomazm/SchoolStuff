import java.util.*;

public class TestMain {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.addAll(getNums());
		
		Converter converter = new Converter(new IteratorStrategy());
		System.out.println(converter.listToString(nums));
		converter.setStrategy(new GetterStrategy());
		System.out.println(converter.listToString(nums));
		converter.setStrategy(new ArrayStrategy());
		System.out.println(converter.listToString(nums));
		
	}
	
	public static List<Integer> getNums(){
		
		List<Integer> nums = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 0; i < 102; i++) {
			nums.add(rand.nextInt(100));
		}
		
		return nums;		
	}
}
