package org.tictactoe.tdd.demo;

import java.util.function.BooleanSupplier;

public class TicTacToe {

	public String calculateResult(char move) {
		if (move == 'O') {
			return "PlayerO";
		} else if (move == 'X') {
			return "PlayerX";
		}
		
		return null;
	}

	public boolean checkIfRowOccupied(int rowNumber, char[][] gameInput) {
		for (int i=0; i < 3; i++) {
			if (gameInput[rowNumber-1][i] == ' ') {
				return false;
			}
		}
		return true;
	}

	public boolean checkIfColumnOccupied(int columnNumber, char[][] gameInput) {
		for (int i=0; i < 3; i++) {
			if (gameInput[i][columnNumber-1] == ' ') {
				return false;
			}
		}
		return true;
	} 
}
