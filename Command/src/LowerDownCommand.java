
public class LowerDownCommand implements Command{

	private Screen screen;

	public LowerDownCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.screenDown();
	}

}
