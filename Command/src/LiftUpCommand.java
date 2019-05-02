
public class LiftUpCommand implements Command{

	private Screen screen;

	public LiftUpCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.screenUp();
	}

}
