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
		return this.gameStatus = this.player1.getSetScore() + "-" + this.player2.getSetScore();

	}

	private boolean isNotGamePoint() {
		// TODO Auto-generated method stub
		return (Math.abs(player1.getGameScore() - player2.getGameScore()) < 2);
	}

	private boolean isMinScoreNotReached() {
		// TODO Auto-generated method stub
		return (player1.getGameScore() >3 || player2.getGameScore() >3);

	}


	private void incrementScore(char player) {
		if(player1.equals(""+player))
		{
			player1.setGameScore(player1.getGameScore()+1);
		}
		else{
			player2.setGameScore(player2.getGameScore()+1);
		}
	}
}
