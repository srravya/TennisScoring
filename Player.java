package TennisScoring;

public class Player {
	private int setScore;
	private int gameScore;
	private String name;

	public Player(String name) {
		this.name = name;
		this.setScore = 0;
		this.gameScore = 0;
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