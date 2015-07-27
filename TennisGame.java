package TennisScoring;

public class TennisGame {
	private Player player1;
	private Player player2;
	private static final int MINIMUM_DIFFERENCE_FOR_A_SET = 2;
	private static final int MINIMUM_SCORE_FOR_A_SET = 4;

	public TennisGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getGameStatus(String pointStatus) {
		for (char point : pointStatus.toCharArray()) {
			if (isMinScoreNotReached() || isNotGamePoint()) {
				System.out.print(point + "\t");
				incrementScore(point);
				System.out.println(player1.getPointScore() + "," + player2.getPointScore());
			} else {
				if (player1.getPointScore() > player2.getPointScore()) {
					player1.setGameScore(player1.getGameScore() + 1);
				} else {
					player2.setGameScore(player2.getGameScore() + 1);
				}
				getSetsStatus(player1,player2);
				break;

				// System.out.println("reseting ");
				// player1.setGameScore(0);
				// player2.setGameScore(0);

			}
		}
		return player1.getGameScore() + "-" + player2.getGameScore();
	}

	private void getSetsStatus(Player player1, Player player2) {
		// TODO Auto-generated method stub
		
	}

	private boolean isNotGamePoint() {

		return (Math.abs(player1.getPointScore() - player2.getPointScore()) < MINIMUM_DIFFERENCE_FOR_A_SET);
	}

	private boolean isMinScoreNotReached() {
		return (player1.getPointScore() < MINIMUM_SCORE_FOR_A_SET && player2.getPointScore() < MINIMUM_SCORE_FOR_A_SET);
	}

	private void incrementScore(char player) {
		if (player1.getName().equals("" + player)) {
			player1.setPointScore(player1.getPointScore() + 1);
		} else {
			player2.setPointScore(player2.getPointScore() + 1);
		}
	}
}
