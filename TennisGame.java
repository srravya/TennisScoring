package TennisScoring;

public class TennisGame {
	private Player player1;
	private Player player2;
	private static final int MINIMUM_DIFFERENCE_FOR_A_SET = 2;
	private static final int MINIMUM_SCORE_FOR_A_SET = 4;
	
	public TennisGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getGameStatus(String pointStatus) {
		
		for (char point : pointStatus.toCharArray()) {
			if (isMinScoreNotReached() || isNotGamePoint()) {

				System.out.print(point+"\t");
				incrementScore(point);
				System.out.println(player1.getGameScore() + "," + player2.getGameScore());
			}
			else{
				if (player1.getGameScore() > player2.getGameScore()) {
					player1.setSetScore(player1.getSetScore() + 1);
				} else {
					player2.setSetScore(player2.getSetScore() + 1);
				}
				break;
//				System.out.println("reseting ");
//				player1.setGameScore(0);
//				player2.setGameScore(0);
				
			}

		}
		

		return player1.getSetScore() + "-" + player2.getSetScore();
	}

	private boolean isNotGamePoint() {

		return (Math.abs(player1.getGameScore() - player2.getGameScore()) < MINIMUM_DIFFERENCE_FOR_A_SET);
	}

	private boolean isMinScoreNotReached() {
		return (player1.getGameScore() < MINIMUM_SCORE_FOR_A_SET && player2.getGameScore() < MINIMUM_SCORE_FOR_A_SET);
	}

	private void incrementScore(char player) {
		if (player1.getName().equals("" + player)) {
			player1.setGameScore(player1.getGameScore() + 1);
		} else {
			player2.setGameScore(player2.getGameScore() + 1);
		}
	}
}
