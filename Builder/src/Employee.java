
public class Employee {

	private BurgerBuilder_IF burgerBuilder;
	
	public Employee(BurgerBuilder_IF bBuilder) {
		burgerBuilder = bBuilder;
	}
	
	public void setBurgerBuilder(BurgerBuilder_IF burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}
	
	public void makeBurger() {
		burgerBuilder.getBread();
		burgerBuilder.getCheese();
		burgerBuilder.getPatty();
		burgerBuilder.getSauce();
		burgerBuilder.getLettuce();
	}
	
	public Object getBurger() {
		makeBurger();
		return burgerBuilder.getBurger();
	}

}