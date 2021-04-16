package org.tictactoe.tdd.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTacToeTest {

	@Test
	void checkForNoResultIfNewGame() {
		TicTacToe game = new TicTacToe();
		String winningTeam = game.calculateResult(' ');
		assertEquals(null, winningTeam);
	}
	
	@Test
	void checkIfPlayerOHasMadeAMove() {
		TicTacToe game = new TicTacToe();
		String winningTeam = game.calculateResult('O');
		assertEquals("PlayerO", winningTeam);
	}
	
	@Test
	void checkIfPlayerXHasMadeAMove() {
		TicTacToe game = new TicTacToe();
		String winningTeam = game.calculateResult('X');
		assertEquals("PlayerX", winningTeam);
	}

}
