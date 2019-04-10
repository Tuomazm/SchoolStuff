
public interface Handler {
	 public abstract void setNext(Handler nextHandler); 
	 public abstract void process(SalaryRaiseRequest request); 
}
