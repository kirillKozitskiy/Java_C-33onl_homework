package ge.tictactoe.game;

import java.util.Random;
import java.util.Scanner;

public class Player {

    public static Board board;

    public String name;
    public static char moveSymbol;

    public Player(String name) {
        this.name = name;
        moveSymbol = randomSelectionOfSymbol();
    }

    public static char randomSelectionOfSymbol() {
        Random random = new Random();
        int randomValue = random.nextInt(1, 51);

        if (randomValue >= 1 && randomValue <= 25) {
            return 'X';
        } else {
            return 'O';
        }
    }

    public static void makeMove(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        if(moveSymbol == 'X'){
            boolean flag = true;
            while (flag) {
                System.out.println("Enter which row(1-3): ");
                int row = scanner.nextInt() - 1;//Need to subtract 1 to prevent arrayOutOfBoundException

                System.out.println("Enter which column(1-3): ");
                int column = scanner.nextInt() - 1;

                if (Board.isSellOccupied(row, column)) {
                    System.out.println("This cell is already occupied, try another one");
                } else if (row >= 0 && row < 3 && column >= 0 && column < 3) {
                    Board.board[row][column] = moveSymbol;
                    flag = false;
                }
                else {
                    System.out.println("Invalid input! Please enter values between 1 and 3.");
                }
            }
        }
        else {
            boolean flag = true;
            while (flag){
                int row = random.nextInt(3);
                int column = random.nextInt(3);

                if(!Board.isSellOccupied(row, column)){
                    Board.board[row][column] = moveSymbol;
                    System.out.println("AI made a move [" + (row+1) + "]" + "[" + (column+1) + "]");
                    flag =false;
                }
            }
        }
        Board.printGameBoard();
    }

    public String getName(){
        return name;
    }

    public static void setMoveSymbol(char moveSymbol){
        Player.moveSymbol = moveSymbol;
    }

    public static char getMoveSymbol(){
        return moveSymbol;
    }

    @Override
    public String toString() {
        return "---Player---\n" +
                "Name: " + name + '\n' +
                "MoveSymbol: " + moveSymbol;
    }
}
