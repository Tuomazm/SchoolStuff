
public class TestMain {

	public static void main(String[] args) {

		Character johnDoe = new Character(new LevelUpVisitor());

		for (int i = 0; i < 5; i++) {
			johnDoe.jump();
			johnDoe.hit();
		}

	}

}
