import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class ThrowAPig extends Game {

	private Map<Integer, Integer> scoreTable;
	private int rounds;
	private int points;
	private Random random;

	@Override
	void initializeGame() {
		scoreTable = new HashMap<>();
		rounds = 0;
		random = new Random();
	}

	@Override
	void makePlay(int player) {
		points = random.nextInt(8);
		switch (points) {
		case 0:
			points = 5;
			break;
		case 1:
			points = 10;
			break;
		case 2:
			points = 15;
			break;
		case 3:
			points = 20;
			break;
		case 4:
			points = 25;
			break;
		case 5:
			points = 40;
			break;
		case 6:
			points = 60;
			break;
		case 7:
			points = -50;
			break;
		default:
			break;
		}

		if (scoreTable.containsKey(player)) {
			scoreTable.put(player, scoreTable.get(player) + points);
		} else {
			scoreTable.put(player, points);
		}
		rounds++;
	}

	@Override
	boolean endOfGame() {
		while (rounds < 10) {
			return false;
		}
		return true;
	}

	@Override
	void printResults() {
		System.out.println("Results after " + rounds + " rounds:\n");
		Map<Integer, Integer> resultsInOrder = new LinkedHashMap<>();
		scoreTable.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
				.forEachOrdered(x -> resultsInOrder.put(x.getKey(), x.getValue()));
		resultsInOrder
				.forEach((plNumber, points) -> System.out.println("Player number " + (plNumber+1) + ", score: " + points));

	}
}