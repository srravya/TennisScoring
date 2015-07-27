package TennisScoring;

public class TestClient {

	public static void main(String[] args) {
		Player player1=new Player("D");
		Player player2=new Player("F");
		String pointState="";
		TennisGame game=new TennisGame(player1, player2);
		if(args.length >= 1){
			pointState=args[0];
		}else{
		 pointState="DFDFFFDFFDDDDDFFDFFDFFDFFDDDDDFFDFDFD";
		}
		System.out.println(game.getGameStatus(pointState));
		
	}

}
