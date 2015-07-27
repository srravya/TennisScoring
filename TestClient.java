package TennisScoring;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1=new Player("D");
		Player player2=new Player("F");
		
		TennisGame game=new TennisGame(player1, player2);
		String pointState="DFFDDFDFDD"
				+ "FDFFDFDFDF";
		System.out.println(game.getGameStatus(pointState));
		
	}

}
