
public class CEO implements Handler{
	
	@Override
	public void setNext(Handler nextHandler) {}

	@Override
	public void process(SalaryRaiseRequest request) {
		System.out.println(getClass().getName() + " took care of this raise. Raise as a percentage was: "+ String.format("%.2f", request.getPercentage()) + "%");
	}	
}
