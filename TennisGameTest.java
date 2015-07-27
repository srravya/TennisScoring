package TennisScoring;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void testGetGameStatus() {
		String expected = "0-1";
		Player player1 = new Player("D");
		Player player2 = new Player("F");
		TennisGame game = new TennisGame(player1, player2);
		
		String pointState = "DFDFFFDFFDDDDDFFDFFDFFDFFDDDDDFFDFDFD";
		String actual = game.getGameStatus(pointState);
		assertEquals("incorrect game score", expected, actual);
		
		pointState = "DFDF";
		actual = game.getGameStatus(pointState);
		assertEquals("incorrect game score", expected, actual);

	}

}
