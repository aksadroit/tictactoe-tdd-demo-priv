package org.tictactoe.tdd.demo;

public class TicTacToe {

	public String calculateResult(char move) {
		if (move == 'O') {
			return "PlayerO";
		} else if (move == 'X') {
			return "PlayerX";
		}
		
		return null;
	} 
}
