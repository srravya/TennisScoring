package TennisScoring;

public class Player {
	private int setScore;
	private int gameScore;
	private String name;

	public Player() {
		this.gameStatus = "";
		this.team1Score = 0;
		this.team2Score = 0;
		this.team1SetScore = 0;
		this.team2SetScore = 0;
	}

	public int getSetScore() {
		return setScore;
	}

	public int getGameScore() {
		return gameScore;
	}

	public String getName() {
		return name;
	}

	public void setSetScore(int setScore) {
		this.setScore = setScore;
	}

	public void setGameScore(int gameScore) {
		this.gameScore = gameScore;
	}

}