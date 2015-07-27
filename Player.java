package TennisScoring;

public class Player {
	private int setScore;
	private int gameScore;
	private String name;
	
	public Player() {
	
		this.name = "";
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
	
}