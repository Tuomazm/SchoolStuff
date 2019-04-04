import java.util.Iterator;
import java.util.List;

public class IteratorStrategy implements ListConverter {

	@Override
	public <E> String listToString(List<E> list) {

		Iterator<E> listItr = list.iterator();
		StringBuilder str = new StringBuilder();
		str.append("With iterator (new line after each number):\n\n");
		while (listItr.hasNext()) {
			str.append(listItr.next().toString() + "\n");
		}
		str.append("\n-------------------------\n");
		return str.toString();
	}
}
