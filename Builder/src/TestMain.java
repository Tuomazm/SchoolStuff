import java.util.List;

public class TestMain {

	public static void main (String[] args) {
		
		Employee employee = new Employee(new McDonaldsBuilder());
		System.out.println("This is the McDonalds burger:\n\n"
				+ employee.getBurger().toString()+ "\n");
		
		System.out.println("Employee starts to work for Hesburger.\n\n");
		
		employee.setBurgerBuilder(new HesburgerBuilder());
		
		System.out.println("This is the Hesburger burger:\n");
		List<Object> hesenBurgeri = (List<Object>) employee.getBurger();
		for (Object burgerPart : hesenBurgeri) {
			System.out.println(burgerPart);
		}
	}
}
