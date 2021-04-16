package org.tictactoe.tdd.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {

	private TicTacToe game;
	
	@BeforeEach
	public void init() {
		game = new TicTacToe();
	}
	
	@Test
	void checkForNoResultIfNewGame() {
		String winningTeam = game.calculateResult(' ');
		assertEquals(null, winningTeam);
	}
	
	@Test
	void checkIfPlayerOHasMadeAMove() {
		String winningTeam = game.calculateResult('O');
		assertEquals("PlayerO", winningTeam);
	}
	
	@Test
	void checkIfPlayerXHasMadeAMove() {
		String winningTeam = game.calculateResult('X');
		assertEquals("PlayerX", winningTeam);
	}
	
	@Test
	void checkIfFirstRowOfTheBoardIsOccupied() {
		char[][] input = {{'X', 'O', 'X'}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		assertTrue(game.checkIfRowOccupied(1, input));
	}
	
	@Test
	void checkIfColumnOfTheBoardIsOccupied() {
		char[][] input = {{'X', ' ', ' '}, {'O', ' ', ' '}, {'O', ' ', ' '}};
		assertTrue(game.checkIfColumnOccupied(1, input));
	}
	
	@Test
	void checkIfDiagnolOfTheBoardIsOccupied() {
		char[][] input = {{'X', ' ', ' '}, {' ', 'O', ' '}, {' ', ' ', 'X'}};
		assertTrue(game.checkIfDiagnolOccupied(input));
	}

}
