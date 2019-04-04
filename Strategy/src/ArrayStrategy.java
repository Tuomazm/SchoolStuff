import java.util.List;

public class ArrayStrategy implements ListConverter {

	@Override
	public <E> String listToString(List<E> list) {
		
		Object[] nums = list.toArray();
		StringBuilder str = new StringBuilder();
		str.append("With array (New line after every third number):\n\n");
		for(int i = 1; i < nums.length + 1; i++) {
			str.append(nums[i - 1] + ", ");
			if(i % 3 == 0) {
				str.append("\n");
			}
		}
		str.append("\n-------------------------");
		
		return str.toString();
	}

}
