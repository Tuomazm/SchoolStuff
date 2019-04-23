
public class Euro implements Currency{

	private double amount;
	
	public Euro(double amount) {
		this.amount = amount;
	}

	@Override
	public double getAmount() {
		return amount;
	}

}
