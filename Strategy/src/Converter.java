import java.util.List;

public class Converter {

	private ListConverter converter;

	public Converter(ListConverter converter) {
		this.converter = converter;
	}
	
	public void setStrategy(ListConverter converter) {
		this.converter = converter;
	}
	
	public <E> String listToString(List<E> list) {
		return converter.listToString(list);
	}
	
	
}
