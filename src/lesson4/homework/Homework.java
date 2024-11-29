package lesson4.homework;

import java.util.Random;

public class Homework {


    //haven't done yet

    public static void main(String[] args) {

        int[] array = createArray(5);

        fillArrayWithRandom(array);

       printArray(array);
       printArrayInReverse(array);

       sortArray(array);
        System.out.println("------------\n");
       printArray(array);


    }

    public static int[] createArray(int size){
        return new int[size];
    }

    public static void fillArrayWithRandom(int[] array){

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {

            int random = rand.nextInt(1,37);
            array[i] = random;
        }
    }

    public static void printArray(int[] array){

        System.out.println("Usual printing");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
    }

    public static void printArrayInReverse(int[] array){

        System.out.println("Printing in reverse");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }

    }

    public static void searchForMaxElement(int[] array){




    }

    public static void sortArray(int[] array){

        boolean sorted = false;

        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {

                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }

    }







}
