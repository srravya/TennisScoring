package TennisScoring;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame game=new TennisGame();
		String pointState="DFFDDFDFDDFDFFDFDFDF";
		System.out.println(game.getGameStatus(pointState));
		
	}

}
