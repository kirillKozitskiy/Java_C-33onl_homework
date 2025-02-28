package lesson20.homework;

import java.util.Scanner;

public class FirstTask {

    public FirstTask() {

        double[] array = getFilledArray();

        Thread firstThread = new Thread(() -> {
            double maxValue = findMax(array);
            System.out.println("max value = " + maxValue);
        });
        Thread secondThread = new Thread(() -> {
            double minValue = findMin(array);
            System.out.println("min value = " + minValue);
        });

        firstThread.start();
        secondThread.start();
    }
    public static double findMin(double[] array) {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static double findMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double[] getFilledArray(){
        double[] array = new double[5];

        getMessage();
        for(int i = 0; i < array.length; i++){
            array[i] = getScanner().nextDouble();
        }
        return array;
    }

    public static void getMessage(){
        System.out.println("Enter few numbers");
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
