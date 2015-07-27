package TennisScoring;

public class TennisGame {
	private String gameStatus;
	private Player player1;
	private Player player2;

	public TennisGame() {
		
		this.gameStatus = "";

	}

	public String getGameStatus(String pointStatus) {
		int i = 0;
		while (isMinScoreNotReached() || isNotGamePoint()) {
			incrementScore(pointStatus.charAt(i++));
		}
//		if (player1.getteam1Score > this.team2Score) {
//			this.team1SetScore++;
//		} else {
//			this.team2SetScore++;
//		}
		return this.gameStatus = this.team1SetScore + "-" + this.team2SetScore;
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
