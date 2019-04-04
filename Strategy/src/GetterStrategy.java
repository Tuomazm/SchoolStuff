import java.util.List;

public class GetterStrategy implements ListConverter {

	@Override
	public <E> String listToString(List<E> list) {

		StringBuilder str = new StringBuilder();
		str.append("With getter (New line after every second number):\n\n");
		for (int i = 1 ; i <= list.size(); i++) {
			str.append(list.get(i - 1) + ", ");
			if (i % 2 == 0) {
				str.append("\n");
			}
		}
		str.append("\n-------------------------\n");
		return str.toString();
	}
}
