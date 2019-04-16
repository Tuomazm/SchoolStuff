
public class McDonaldsBuilder implements BurgerBuilder_IF{

	private StringBuilder mcBurger;
	
	public McDonaldsBuilder() {
		mcBurger = new StringBuilder();
	}
	
	@Override
	public void getPatty() {
		mcBurger.append("McPatty\n");
	}

	@Override
	public void getSauce() {
		mcBurger.append("McMayo\n");
		
	}

	@Override
	public void getBread() {
		mcBurger.append("McBread\n");		
	}

	@Override
	public void getCheese() {
		mcBurger.append("McCheddar\n");
	}

	@Override
	public void getLettuce() {
		mcBurger.append("McLettuce\n");		
	}
	
	@Override
	public Object getBurger() {
		return mcBurger;
	}

}
