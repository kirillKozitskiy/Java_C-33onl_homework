package ge.tictactoe.game;

import java.util.Scanner;

public class Game {
    static Player player;
    static Board board;
    public static char currentPlayer;

    public Game(){
        startTheGame();
    }

    public static void startTheGame(){
        Scanner sc = new Scanner(System.in);
        printWelcomeMsg();

        if(sc.nextLine().equals("y")){
            Board.initializeGameBoard();
            Board.printGameBoard();
            currentPlayer = Player.getMoveSymbol();

            while(true){
                Player.makeMove();
                if(Board.checkForWin()){
                    System.out.println();
                    Board.printGameBoard();
                    System.out.println(currentPlayer+" = has WON!");
                    break;
                }
                else if(Board.isBoardFull()){
                    Board.printGameBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                if(Player.getMoveSymbol()=='X'){
                    Player.setMoveSymbol('O');
                }
                else {
                    Player.setMoveSymbol('X');
                }
            }
            System.out.println("Would you like to play again?");
            if(sc.nextLine().equals("y")){
                Board.cleanTheBoard();
            }
            else {
                System.out.println("GoodBye!");
            }
        }
        else {
            System.out.println("GoodBye!");
        }
        sc.close();
    }

    public static void printWelcomeMsg(){
        System.out.println("\u001B[32mHello, player\n" +
                "If you wanna play --- pres 'y' bottom\n" +
                "If you don't want to play --- pres any key \u001B[0m");
    }

}
