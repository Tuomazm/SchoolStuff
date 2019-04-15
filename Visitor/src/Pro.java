
public class Pro implements CharacterState_IF {

	private int expPoints;
	
	public Pro(int exP) {
		expPoints = exP;
	}
	
	@Override
	public void jump() {
		System.out.println("Pro jump");
		expPoints += 3;
	}

	@Override
	public void hit() {
		System.out.println("Pro hit");
		expPoints += 5;		
	}

	@Override
	public String getName() {
		return "Pro";
	}

	@Override
	public int getExpPoints() {
		return expPoints;
	}

}
