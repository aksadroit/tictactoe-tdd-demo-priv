package org.tictactoe.tdd.demo;

public class TicTacToe {
	
	public String calculateResult(char[][] gameInput) {
		char move = ' ';
		String winningTeam = null;
		
		for (int i=0; i < 3; i++) {
			if (checkIfRowOccupied(i+1, gameInput)) {
				move = gameInput[i][0];
				for (int j=1; j < 3; j++) {
					if (gameInput[i][j] != move) {
						move = ' ';
						break;
					}
				}
				if (move != ' ') {
					winningTeam = getWinningTeam(move);
					break;
				}
			}
		}
		
		if (winningTeam == null) {
			for (int i = 0; i < 3; i++) {
				if (checkIfColumnOccupied(i+1, gameInput)) {
					move = gameInput[0][i];
					for (int j=1; j < 3; j++) {
						if (gameInput[j][i] != move) {
							move = ' ';
							break;
						}
					}
					if (move != ' ') {
						winningTeam = getWinningTeam(move);
						break;
					}
				}
			}
		}
		
		if (winningTeam == null) {
			if (checkIfDiagnolOccupied(gameInput)) {
				move = gameInput[0][0];
				for (int i=0; i < 3; i++) {
					for (int j=0; j < 3; j++) {
						if (i==j && gameInput[i][j] != move) {
							move = ' ';
							break;
						}
					}
				}
				winningTeam = getWinningTeam(move);
			}
		}
		
		return winningTeam;
	}

	public String getWinningTeam(char move) {
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

	public boolean checkIfDiagnolOccupied(char[][] gameInput) {
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				if (i==j && gameInput[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	} 
}
