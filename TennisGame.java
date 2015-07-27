package TennisScoring;

public class TennisGame {
	private String gameStatus;
	private Player player1;
	private Player player2;

	public TennisGame() {
		super();
		this.gameStatus = "";

	}

	public String getGameStatus(String pointStatus) {
		int i = 0;
		while (isMinScoreNotReached() || isNotGamePoint()) {
			incrementScore(pointStatus.charAt(i++));
		}
		int player1Score = player1.getGameScore();
		int player2Score = player2.getGameScore();
		if (player1Score > player2Score) {
			player1.setSetScore(1);
		} else {
			player2.setSetScore(1);
		}
		return this.gameStatus = player1.getSetScore() + "-" + player2.getSetScore();
	}

	private boolean isNotGamePoint() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isMinScoreNotReached() {
		// TODO Auto-generated method stub
		return false;
	}

	private void incrementScore(char player) {

	}
}
