
public class TestMain {

	public static void main(String[] args) {
		
	    Handler superior = new Superior(); 
        Handler headOfUnit = new HeadOfUnit(); 
        Handler ceo = new CEO(); 
        superior.setNext(headOfUnit); 
        headOfUnit.setNext(ceo); 
  
        superior.process(new SalaryRaiseRequest(2500, 2700)); 
        superior.process(new SalaryRaiseRequest(3500, 3550));
        superior.process(new SalaryRaiseRequest(4700, 4850));
        superior.process(new SalaryRaiseRequest(2500, 2900));
        superior.process(new SalaryRaiseRequest(2500, 2525));
	
	}

}
