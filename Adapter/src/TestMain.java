
public class TestMain {

	public static void main (String[] args) {
		
		Currency euros = new Euro(175);
		CurrencyAdapter converter = new Converter(euros);
		System.out.println(euros.getAmount() + " euros, converted to dollars: " + converter.getAmountAsDollars());
		System.out.println(euros.getAmount() + " euros, converted to SEK: " + converter.getAmountAsSEK());
		
	}
}
