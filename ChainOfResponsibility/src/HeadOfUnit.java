
public class HeadOfUnit implements Handler{
	
	private Handler nextHandler;
	
	@Override
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void process(SalaryRaiseRequest request) {
		if (request.getPercentage() < 5) {
			System.out.println(getClass().getName() + " took care of this raise. Raise as a percentage was: "+ String.format("%.2f", request.getPercentage()) + "%");
		}else {
			nextHandler.process(request);
		}		
	}	
}
