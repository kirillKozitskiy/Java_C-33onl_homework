package lesson5.homework;

import java.util.Scanner;

public class StarSymbolTask {
    public static void main(String[] args) {

        int [][] multiArray = createMultiArray();
        //int [][] multiArray = new int[3][3];

        fillMultiArray(multiArray);
        printTwoDimensionalArray(multiArray);



    }

    public static void printTwoDimensionalArray(int[][] multiArray) {
        for(int[] row : multiArray) {
            for(int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMultiArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of raws: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        return new int[rows][cols];
    }

    public static void fillMultiArray(int[][] multiArray){

        int filler = 1;


        for(int outer = 0; outer < multiArray.length; outer++) {
            if(outer%2 == 0) {
                for(int inner = 0; inner < multiArray[outer].length; inner++) {
                    multiArray[outer][inner] = filler;
                    filler++;
                }
            }
            else {
                for(int inner = (multiArray[outer].length) - 1; inner >= 0; inner--) {
                    multiArray[outer][inner] = filler;
                    filler++;
                }
            }
        }
    }
}
