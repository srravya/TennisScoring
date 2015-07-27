package TennisScoring;

public class TennisGame {
	private String gameStatus;
	private int team1Score;
	private int team2Score;

	public TennisGame() {
		super();
		this.gameStatus = "";
		this.team1Score = 0;
		this.team2Score = 0;
	}

	public String getGameStatus(String pointStatus) {

		incrementScore('j');
		isTie();
		return this.gameStatus;
	}

	private boolean isTie() {
		return false;
	}

	private void incrementScore(char player) {

	}
}
