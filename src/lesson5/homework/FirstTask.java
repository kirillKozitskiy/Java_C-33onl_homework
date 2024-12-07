package lesson5.homework;

import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        int[][] myArray = createMultiArray();

        fillArrayWithRandomDigits(myArray);

        printTwoDimensionalArray(myArray);

        addToExisting(myArray);

        printTwoDimensionalArray(myArray);

        findSumOfMultiArrayElements(myArray);






    }

    public static void fillArrayWithRandomDigits(int[][] multiArray){
        Random rand = new Random();

        for(int outer = 0; outer < multiArray.length; outer++) {
            for(int inner = 0; inner < multiArray[outer].length; inner++){
                multiArray[outer][inner] = rand.nextInt(27);
            }
        }
    }

    public static int[][] createMultiArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        return new int[rows][columns];
    }

    public static void printTwoDimensionalArray(int[][] multiArray) {
        for(int outer = 0; outer < multiArray.length; outer++) {
            for(int inner = 0; inner<multiArray[outer].length; inner++){
                System.out.print(multiArray[outer][inner] + " ");
            }
            System.out.println();
        }
    }

    public static void addToExisting(int[][] multiArray){

        System.out.println("Enter the number you would like to add: ");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();

        for(int outer = 0; outer<multiArray.length; outer++){
            for(int inner = 0; inner<multiArray[outer].length; inner++){
                multiArray[outer][inner]+=enteredNumber;
            }
        }

    }

    public static void findSumOfMultiArrayElements(int[][] multiArray){
        int sum = 0;
        for(int[] row : multiArray){
            for(int element : row){
                sum+=element;
            }
        }
        System.out.println("\nThe sum of the elements is: " + sum);
    }

}
