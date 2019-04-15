
public class LevelUpVisitor implements Visitor_IF {

	@Override
	public void visit(Character character) {

		if (character.getStateName() == "Junior") {
			if (character.getExpPoints() >= 10) {
				character.grow(new Pro(character.getExpPoints()));
			}
		}
		if (character.getStateName() == "Pro") {
			if (character.getExpPoints() >= 20) {
				character.grow(new Guru(character.getExpPoints()));
			}

		}
	}

}
