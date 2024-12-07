package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

//Wrote the code for 3 minutes. Thought about algorithm for an hour


public class SecondTask {

    public static void main(String[] args) {

        String[][] multiArray  = new String[8][8];

        fillArrayLikeAChessBoard(multiArray);

        printTwoDimensionalArray(multiArray);
    }

    public static void printTwoDimensionalArray(String[][] multiArray) {
        for(String[] row : multiArray) {
            for(String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void fillArrayLikeAChessBoard(String[][] multiArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first symbol that will be on the board: ");
        String firstSymbol = sc.nextLine();
        System.out.println("Enter the second symbol that will be on the board: ");
        String secondSymbol = sc.nextLine();

        for(int outer = 0; outer < multiArray.length; outer++){
            for(int inner = 0; inner < multiArray[outer].length; inner++){
                if( (outer + inner) % 2 == 0){
                    multiArray[outer][inner] = firstSymbol;
                }
                else
                    multiArray[outer][inner] = secondSymbol;
            }
        }




    }
}
