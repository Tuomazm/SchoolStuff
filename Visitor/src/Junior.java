
public class Junior implements CharacterState_IF {

	private int expPoints;
	
	public Junior(int exP) {
		expPoints = exP;
	}

	@Override
	public void jump() {
		System.out.println("Junior jump");
		expPoints += 2;
	}

	@Override
	public void hit() {
		System.out.println("Junior hit");
		expPoints += 3; 		
	}

	public int getExpPoints() {
		return expPoints;
	}
	
	@Override
	public String getName() {
		return "Junior";
	}

}
