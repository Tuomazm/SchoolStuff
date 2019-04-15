
public class Character {

	private CharacterState_IF state;
	private int experiencePoints;
	private Visitor_IF visitor;

	public Character(LevelUpVisitor lVisitor) {
		visitor = lVisitor;
		experiencePoints = 0;
		state = new Junior(experiencePoints);
		System.out.println("I am a new character, " + state.getName());
	}
	
	public void grow(CharacterState_IF characterState) {
		state = characterState;
		System.out.println("The character just leveled up to " + state.getName() + " as he has " + state.getExpPoints() + " experience points.");
	}

	public void jump() {
		state.jump();
		visitor.visit(this);
	}
	
	public void hit() {
		state.hit();
		visitor.visit(this);
	}
	
	public int getExpPoints() {
		return state.getExpPoints();
	}
	
	public String getStateName() {
		return state.getName();
	}
}
