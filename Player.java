package TennisScoring;

public class Player {
	private int setScore;
	private int gameScore;
	private String name;
	public int getSetScore() {
		return setScore;
	}
	public int getGameScore() {
		return gameScore;
	}
	public String getName() {
		return name;
	}
	
	
	public Player() {
	
		super();
		this.gameStatus = "";
		this.team1Score = 0;
		this.team2Score = 0;
		this.team1SetScore = 0;
		this.team2SetScore = 0;

	}
	
}