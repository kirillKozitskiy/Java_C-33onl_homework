package lesson3.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TheSecondBlockPartTwo {
    public static void main(String[] args) {

        //firstTask();

        //secondTask();

        //thirdTask();

        //fourthTask();

        fifthTaskWithStarSymbol();




    }


    public static void firstTask(){

        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
            System.out.println("The number is odd");
    }

    public static void secondTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter street temperature:\t");

        int temperature = sc.nextInt();

        if(temperature > -5)
            System.out.println("Warm");
        else if (temperature <= -5 && temperature > -20)
            System.out.println("Normal");
        else
            System.out.println("Cold");

        sc.close();
    }

    public static void thirdTask(){

        for(int i = 10;  i<=20; i++){
            System.out.println(i*i+"\n");
        }
    }

    public static void fourthTask(){

        int value = 7;
        int helpValue = 0;
        while (helpValue<98){
            System.out.print((helpValue+=value)+" ");
        }
    }


    /*
    I use try catch to prevent an exception.
    We haven't had this lesson yet, but I am familiar with this design and in assignment says that we need
    to do a check to make sure that the user has not entered incorrect data(we need to enter Integer)
     */

    public static void fifthTaskWithStarSymbol(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int sum = 0;

        try {
            while(!flag){
                System.out.println("Enter the number: ");
                int value = sc.nextInt();
                if(value>0){
                    for(int i = 0; i<=value; i++){
                        sum+=i;
                    }
                    System.out.println("The sum is: "+sum);
                    flag = true;
                }
                else {
                    System.out.println("You entered negative number. Try again.");
                }
            }

        }
        catch (InputMismatchException e){
            System.out.println("You entered a non integer number. Try again.");
        }



    }

}
