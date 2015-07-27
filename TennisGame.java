package TennisScoring;

public class TennisGame {
	private String gameStatus;
	private Player player1;
	private Player player2;

	public TennisGame(Player player1, Player player2) {
		this.gameStatus = "";

		this.player1 = player1;
		this.player2 = player2;
	}

	public String getGameStatus(String pointStatus) {
		int i = 0;
		while (isMinScoreNotReached() || isNotGamePoint()) {
			incrementScore(pointStatus.charAt(i++));
		}
		int player1Score = player1.getGameScore();
		int player2Score = player2.getGameScore();
		if (player1Score > player2Score) {
			player1.setSetScore(player1.getSetScore()+1);
		} else {
			player2.setSetScore(player2.getSetScore()+1);
		}
		return this.gameStatus = player1.getSetScore() + "-" + player2.getSetScore();
	}

	private boolean isNotGamePoint() {
		return (Math.abs(player1.getGameScore() - player2.getGameScore()) < 2);
	}

	private boolean isMinScoreNotReached() {
		return (player1.getGameScore() > 3 || player2.getGameScore() > 3);
	}

	private void incrementScore(char player) {
		if (player1.equals("" + player)) {
			player1.setGameScore(player1.getGameScore() + 1);
		} else {
			player2.setGameScore(player2.getGameScore() + 1);
		}
	}
}
