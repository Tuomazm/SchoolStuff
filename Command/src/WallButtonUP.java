
public class WallButtonUP {

	private Command cmd;
	
	public WallButtonUP(Command cmd) {
		this.cmd = cmd;
	}
	
	public void push() {
		cmd.execute();
	}
	
}
