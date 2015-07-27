package TennisScoring;

public class Player {
	private int gameScore;

	private int pointsScore;

	private int setScore;

	private String name;

	public Player(String name) {
		this.name = name;
		this.gameScore = 0;

		this.pointsScore = 0;

		this.setScore = 0;
	}

	public int getSetScore() {
		return setScore;

	}

	public int getMatchScore() {
		return setScore;
	}

	public void setSetScore(int matchScore) {
		this.setScore = matchScore;
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