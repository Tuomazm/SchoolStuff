
public class Converter implements CurrencyAdapter{

	private Currency euros;

	public Converter(Currency euros) {
		this.euros = euros;
	}

	@Override
	public double getAmountAsDollars() {
		return convertToDollars(euros.getAmount());
	}
	
	private double convertToDollars(double euros) {
		return euros * 1.25;
	}

	@Override
	public double getAmountAsSEK() {
		return convertToSEK(euros.getAmount());
	}
	
	private double convertToSEK(double euros) {
		return euros * 10.48;
	}

}
