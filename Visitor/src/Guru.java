
public class Guru implements CharacterState_IF {

	private int expPoints;
	
	public Guru(int exP) {
		expPoints = exP;
	}

	@Override
	public void jump() {
		System.out.println("Guru jump");
		expPoints += 6;
	}

	@Override
	public void hit() {
		System.out.println("Guru hit");
		expPoints += 10; 
	}

	@Override
	public String getName() {
		return "Guru";
	}

	@Override
	public int getExpPoints() {
		return expPoints;
	}

}
