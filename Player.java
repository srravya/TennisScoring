package TennisScoring;

public class Player {
	private int gameScore;
	private int pointsScore;
	private String name;

	public Player(String name) {
		this.name = name;
		this.gameScore = 0;
		this.pointsScore = 0;
	}

	public int getGameScore() {
		return gameScore;
	}

	public int getPointScore() {
		return pointsScore;
	}

	public String getName() {
		return name;
	}

	public void setGameScore(int setScore) {
		this.gameScore = setScore;
	}

	public void setPointScore(int gameScore) {
		this.pointsScore = gameScore;
	}

}