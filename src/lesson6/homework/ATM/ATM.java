package lesson6.homework.ATM;

import java.util.Scanner;

public class ATM {

    private int numOf20;
    private int numOf50;
    private int numOf100;

    private int sumOfAllMoney;

    //Entering number of bills
    public ATM(int numOf20, int numOf50, int numOf100) {
        this.numOf20 = numOf20;
        this.numOf50 = numOf50;
        this.numOf100 = numOf100;
    }

    public void startATM(){

        chooseActions();




    }

    public void chooseActions(){

        System.out.println("Look carefully man. You have 3 options here:\n" +
                "-1- Add some money to this freaking ATM\n" +
                "-2- Withdraw a cash before they call the goddamn police\n" +
                "-3- Look at ATM information(WARNING: it can costs you freedom)" +
                "-Any key- Get your ass out of this crepy place\n" +
                "You need to choose an option(1 or 2 or 3) as fast as you can...");

        calculateSumOfAllMoney();

        int option = inputSomeInfo().nextInt();

        if(option == 1){
            addMoney();
            System.out.println();
            showATMInfo();
        }
        else if(option == 2){
            isWithdrawSuccessful();
            System.out.println();
            showATMInfo();
        }
        else if(option == 3){
            showATMInfo();

        }
        else {
            System.out.println("You made a right chose.. There is nothing more valuable than your life");
        }




    }


    public void calculateSumOfAllMoney(){
        sumOfAllMoney = numOf20*20 + numOf50*50 + numOf100*100;
        System.out.println("The sum of all money is: " + sumOfAllMoney);
    }

    public void addMoney(){


            System.out.println("Enter what denomination you want to add: 20 or 50 or 100");
            int denomination = inputSomeInfo().nextInt();

            switch (denomination) {
                case 20:
                    System.out.println("Enter how much bills you want to add. If you want to stop - enter 's'");
                    int bills = inputSomeInfo().nextInt();
                    numOf20 += bills;
                    sumOfAllMoney += bills * 20;
                    break;


                case 50:
                    System.out.println("Enter how much bills you want to add. If you want to stop - enter 's'");
                    bills = inputSomeInfo().nextInt();
                    numOf50 += bills;
                    sumOfAllMoney += bills * 50;

                    break;
                case 100:
                    System.out.println("Enter how much bills you want to add. If you want to stop - enter 's'");
                    bills = inputSomeInfo().nextInt();
                    numOf100 += bills;
                    sumOfAllMoney += bills * 100;

                    break;
                default:
                    System.out.println("Invalid denomination");
                    break;




             }


    }


    public boolean withdrawMoney(){
        System.out.println("Input the sum of money you want to withdraw: ");
        int moneyToWithdraw = inputSomeInfo().nextInt();

        if(moneyToWithdraw >= sumOfAllMoney){
            System.out.println("You don't have enough money to withdraw");
            return false;
        }
        else{

            int constantSumInThisMethod = moneyToWithdraw;

            int num100 = moneyToWithdraw/100;
            if(num100>numOf100){
                num100 = numOf100;
            }
            moneyToWithdraw -= num100*100;

            int num50 = moneyToWithdraw/50;
            if(num50>numOf50){
                num50 = numOf50;
            }
            moneyToWithdraw -= num50*50;

            int num20 = moneyToWithdraw/20;
            if(num20>numOf20){
                num20 = numOf20;
            }
            moneyToWithdraw -= num20*20;

            if(moneyToWithdraw>0){
                System.out.println("Not enough bills to dispense");
            }
            else {
                numOf100-=num100;
                numOf50-=num50;
                numOf20-=num20;
                System.out.println("100-ruble bills: "+ num100+"\n50-ruble bills: "+num50+"\n20-ruble bills: "+num20);
            }
            return true;



        }

    }
    public void isWithdrawSuccessful(){
        if(withdrawMoney()){
            System.out.println("The operation went successfully");
        }
        else{
            System.out.println("Something went wrong");
        }
    }

    public void showATMInfo(){
        System.out.println("The sum of all money is: " + sumOfAllMoney);
        System.out.println("numOf20: " + numOf20);
        System.out.println("numOf50: " + numOf50);
        System.out.println("numOf100: " + numOf100);
    }





    private Scanner inputSomeInfo(){
        return new Scanner(System.in);
    }






}
