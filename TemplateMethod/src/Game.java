
public abstract class Game {

	protected int playersCount;

	abstract void initializeGame();

	abstract void makePlay(int player);

	abstract boolean endOfGame();

	abstract void printResults();

	public void play(int playersCount) {
		this.playersCount = playersCount;
		initializeGame();
		int p = 0;
		while (!endOfGame()) {
			makePlay(p);
			p = (p + 1) % playersCount;
		}
		printResults();
	}
}
