package lesson4.homework;

import java.util.Arrays;
import java.util.Random;

public class Homework {


    //haven't done yet

    public static void main(String[] args) {

        int[] array = createArray(5);

        fillArrayWithRandom(array);
        //printArray(array);

        printArray2(array);


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

    public static void searchForMinElement(int[] array){
        int min = array[0];
        int index = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Min element is "+min+"\nIndex of min is "+index);
    }

    public static void searchForMaxElement(int[] array){
        int max = array[0];
        int index = 0;
        for(int i = 0; i <array.length; i++){
            if(array[i]>max){
                max = array[i];
                index = i;
            }

        }
        System.out.println("Max element is "+max+"\nIndex of max is "+index);
    }

    public static void searchForZeroElement(int[] array){
        int counter = 0;
        for(int current: array){
            if(current==0){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("We have no zero elements in the array");
        }
        else
            System.out.println("We have "+counter+" zero elements in the array");

    }

    public static void swapPlaces(int[] array){
        
        int size = array.length;
        
        for(int i = 0; i < size/2; i++){
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
    }

    public static boolean isIncrementalArray(int[] array){
        for(int i = 1; i<array.length; i++){
            if(array[i]<=array[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void incrementCheck(int[] array){
        boolean isIncrement = isIncrementalArray(array);
        if(isIncrement)
            System.out.println("Array is incremental");
        else
            System.out.println("Array is not incremental");


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

    public static void printArray2(int[] array){

        int n = array.length;

        for (int i = 0; i < n; i++) {
            if(array[n-i]<9){
                array[n-i]++;
                break;
            }

        }


    }











}
