
public class SalaryRaiseRequest {

	private double salaryNow;
	private double requestAmount;
	
	public SalaryRaiseRequest(double salaryNow, double requestAmount) {
		this.salaryNow = salaryNow;
		this.requestAmount = requestAmount;
	}
	
	public double getPercentage() {
		return ((((salaryNow + requestAmount) - salaryNow) / salaryNow) - 1) * 100;	 
	}
}
