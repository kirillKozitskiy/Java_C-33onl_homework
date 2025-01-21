

package ge.tictactoe.game;

import static ge.tictactoe.game.Game.currentPlayer;

public class Board {

    public static char[][] board = new char[3][3];

    public static void initializeGameBoard(){
        for(int outer = 0; outer < 3; outer++){
            for(int inner = 0; inner < 3; inner++) {
                board[outer][inner] = '-';
            }
        }
    }

    public static boolean checkForWin(){
        for(int counter = 0; counter<3 ; counter++){
            if((board[counter][0] == currentPlayer && board[counter][1] == currentPlayer
                    && board[counter][2] == currentPlayer)
                    ||(board[0][counter] == currentPlayer && board[1][counter] == currentPlayer
                    && board[2][counter] == currentPlayer))
                return true;
        }
        return ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
                ||(board[2][0] == currentPlayer && board[1][1] == currentPlayer && board[0][2] == currentPlayer));
    }

    public static void printGameBoard(){
        for(char[] outer : board){
            for(char inner : outer){
                System.out.print(" "+inner+" ");
            }
            System.out.println();
        }
    }

    public static boolean isBoardFull(){
        for(int outer = 0; outer<3; outer++){
            for(int inner = 0; inner < 3; inner++){
                if(board[outer][inner] == '-')
                    return false;
            }
        }
        return true;
    }

    public static void cleanTheBoard(){
        board = new char[3][3];
        initializeGameBoard();
    }

    public static boolean isSellOccupied(int row, int column){
        return board[row][column] != '-';
    }


}
