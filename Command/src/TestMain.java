
public class TestMain {

	public static void main(String[] args) {
		
		Screen movieScreen = new Screen();
		Command cmdDown = new LowerDownCommand(movieScreen);
		Command cmdUp = new LiftUpCommand(movieScreen);
		WallButtonDown downBtn = new WallButtonDown(cmdDown);
		WallButtonUP upBtn = new WallButtonUP(cmdUp);
		
		System.out.println("Lets watch a movie!");
		downBtn.push();
		System.out.println("Movie done!");
		upBtn.push();
		System.out.println("End of the movie night.");
		
	}

}
