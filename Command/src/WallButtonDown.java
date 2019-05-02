
public class WallButtonDown {

	private Command cmd;
	
	public WallButtonDown(Command cmd) {
		this.cmd = cmd;
	}
	
	public void push() {
		cmd.execute();
	}
	
}