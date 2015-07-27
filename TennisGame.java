package TennisScoring;

public class TennisGame {
	private String gameStatus;
	private int team1Score;
	private int team2Score;
	private int team1SetScore;
	private int team2SetScore;

	public TennisGame() {
		super();
		this.gameStatus = "";
		this.team1Score = 0;
		this.team2Score = 0;
		this.team1SetScore = 0;
		this.team2SetScore = 0;

	}

	public String getGameStatus(String pointStatus) {
		int i = 0;
		while (isMinScoreNotReached() || isNotGamePoint()) {
			incrementScore(pointStatus.charAt(i++));
		}
		if (this.team1Score > this.team2Score) {
			this.team1SetScore++;
		} else {
			this.team2SetScore++;
		}
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

	private boolean isTie() {
		return false;
	}

	private void incrementScore(char player) {

	}
}
