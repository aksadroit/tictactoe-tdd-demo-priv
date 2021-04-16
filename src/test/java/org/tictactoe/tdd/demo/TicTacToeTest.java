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
		String winningTeam = game.getWinningTeam(' ');
		assertEquals(null, winningTeam);
	}
	
	@Test
	void checkIfPlayerOHasMadeAMove() {
		String winningTeam = game.getWinningTeam('O');
		assertEquals("PlayerO", winningTeam);
	}
	
	@Test
	void checkIfPlayerXHasMadeAMove() {
		String winningTeam = game.getWinningTeam('X');
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
	
	@Test
	void calculateWinnerIfARowOfTheBoardIsOccuppiedByPlayerX() {
		char[][] input = {{'X', 'X', 'X'}, {'O', ' ', ' '}, {'O', ' ', ' '}};
		assertEquals("PlayerX", game.calculateResult(input));
	}
	
	@Test
	void calculateWinnerIfSecondRowOfTheBoardIsOccuppiedByPlayerO() {
		char[][] input = {{'X', 'O', 'X'}, {'O', 'O', 'O'}, {'O', ' ', ' '}};
		assertEquals("PlayerO", game.calculateResult(input));
	}
	
	@Test
	void calculateWinnerIfFirstColumnOfTheBoardIsOccuppiedByPlayerX() {
		char[][] input = {{'X', 'O', 'X'}, {'X', 'O', 'O'}, {'X', ' ', ' '}};
		assertEquals("PlayerX", game.calculateResult(input));
	}
	
	@Test
	void calculateWinnerIfThirdColumnOfTheBoardIsOccuppiedByPlayerO() {
		char[][] input = {{'X', 'O', 'O'}, {' ', 'O', 'O'}, {'X', ' ', 'O'}};
		assertEquals("PlayerO", game.calculateResult(input));
	}
	
	@Test
	void calculateWinnerIfDiagnalOfTheBoardIsOccuppiedByPlayerX() {
		char[][] input = {{'X', 'O', 'O'}, {' ', 'X', 'X'}, {'O', ' ', 'X'}};
		assertEquals("PlayerX", game.calculateResult(input));
	}
	
	@Test
	void checksIfMatchEndsInDraw() {
		char[][] input = {{'X', 'O', 'O'}, {'O', 'X', 'X'}, {'O', 'X', 'O'}};
		assertEquals(null, game.calculateResult(input));
	}
}
