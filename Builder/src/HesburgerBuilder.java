import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder implements BurgerBuilder_IF {

	List<Object> kerroshampurilainen;
	
	public HesburgerBuilder() {
		kerroshampurilainen = new ArrayList<>();
	}
	
	@Override
	public void getPatty() {
		kerroshampurilainen.add(new Patty("Kotimainen kokolihapihvi"));
	}

	@Override
	public void getSauce() {
		kerroshampurilainen.add(new Sauce("Hesen kastike"));
	}

	@Override
	public void getBread() {
		kerroshampurilainen.add(new Bread("Sämpylä"));
	}

	@Override
	public void getCheese() {
		kerroshampurilainen.add(new Cheese("Cheddar-juusto"));
	}

	@Override
	public void getLettuce() {
		kerroshampurilainen.add(new Lettuce("Tuore lehtisalaatti"));
	}

	@Override
	public Object getBurger() {
		return kerroshampurilainen;
	}
}
