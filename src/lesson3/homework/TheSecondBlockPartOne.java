package lesson3.homework;

import java.util.Scanner;

public class TheSecondBlockPartOne {
    public static void main(String[] args) throws InterruptedException {

        /*Information for Archil: the main method throws exceptions because
        I use the sleep method in the secondTask for fun.
        */


        //firstTask();

        //secondTask();

        //thirdTask();

        //fourthTask();

        //fifthTask();

        //taskWithStarSymbol();


    }


    public static void firstTask(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first value:\t");
        int firstValue = sc.nextInt();
        System.out.print("Input the second value:\t");
        int secondValue = sc.nextInt();

        int result = 4*(firstValue+secondValue-1)/2;

        System.out.println("Your result of the equation is "+result);



    }

    public static void secondTask() throws InterruptedException {
        System.out.println("THE SECOND TASK");

        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        System.out.println("Enter a two-digit number:\t");

        while(!validInput) {
            int number = sc.nextInt();

            if (9 < number && number < 99) {
                System.out.println("Calculating...\nPlease wait a bit");
                Thread.sleep(4000);

                int result = (number / 10 + number % 10);

                System.out.println("The sum of digits in your number is " + result);
                validInput = true;
            } else {
                System.out.println("You've entered an invalid number\nTry again");

            }
        }
        sc.close();




    }

    public static void thirdTask(){
        System.out.println("THE THIRD TASK");

        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        System.out.println("Enter a three digit number:\t");

        while (!validInput) {


            int number = sc.nextInt();

            if (99 < number && number < 999) {
                int result = 0;

                while (number > 0) {
                    result += number % 10;
                    number /= 10;
                }

                System.out.println("The sum of digits in your number is " + result);
                validInput = true;
            } else {
                System.out.println("You've entered an invalid number\nTry again");

            }
        }






    }

    public static void fourthTask(){
        System.out.println("THE FOURTH TASK");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fractional number to round:\t ");

        double fractionalNumber = sc.nextDouble();

        int roundValue = (int) Math.round(fractionalNumber);

        System.out.println("Your round value is "+roundValue);
    }

    public static void fifthTask(){
        System.out.println("THE FIFTH TASK");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value:\t");
        int firstValue = sc.nextInt();

        System.out.println("Enter the second value:\t");
        int secondValue = sc.nextInt();

        int remainder = firstValue%secondValue;
        int result = firstValue/secondValue;

        System.out.println(firstValue+" / "+secondValue+" = "+result+" and "+remainder+" left");

    }

    public static void taskWithStarSymbol(){
        System.out.println("THE STAR SYMBOL TASK");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values and I'll switch them around:\t");

        int firstValue = sc.nextInt();
        int secondValue = sc.nextInt();

        System.out.println("first value is "+firstValue);
        System.out.println("second value is "+secondValue+"\n");
        //solution without third value
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;

        System.out.println("first value is "+firstValue);
        System.out.println("second value is "+secondValue);

        /* solution with third value
          int b;
          b = one;
          one = two;
          two = b;
         */

    }

}
