package com.game.guessword;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//I didn't have time to finish an assignment

public class Game {

    public static void main(String[] args) {

        startGame();
    }

    public static void startGame() {

        char[] hiddenWord = getHiddenWord().toCharArray();
        //printHiddenWord(hiddenWord);
        char[] openWord = new char[hiddenWord.length];
        Arrays.fill(openWord, 0, openWord.length,'*');

        playOrNot();

        boolean flag = false;
        while (!flag) {
            if(getInput().nextLine().equals("y"))
            {

                getMessagePlay();
                printHiddenWord(openWord);
                inputRequest();

                String input = getInput().nextLine();
                if(input.equals("1")) {
                    System.out.println("Enter the word");
                    flag = checkWord(hiddenWord);

                }
                else if(input.equals("2")) {

                    System.out.println("Enter the symbols");
                    flag = checkLetter(hiddenWord);
                }
                else if(input.equals("3")) {
                    System.out.println("You decided to quit the game. Goodbye");
                    return;
                }
                else {
                    System.out.println("Invalid input. Read the instruction above and repeat input");
                    continue;
                }
            }
            else {
                System.out.println("You decided to live. Goodbye");
                flag = true;
            }
        }
    }

    public static boolean checkLetter(char[] hiddenWord) {

        boolean flag = false;
        int counter = 0;

        while (!flag){
            char[] input = getInput().nextLine().toCharArray();
            if(input[0] == hiddenWord[counter]){
                System.out.println("You guessed "+ (counter+1)+" symbol");
                if(counter == hiddenWord.length - 1){
                    printWonMessage();
                    flag = true;
                }
                counter++;
            }
            else{
                System.out.println("You entered "+ counter +" symbol wrong\nTry again!");
            }

        }

        return flag;
    }

    public static void printWonMessage(){
        System.out.println("\nYou guessed the word! Congratulations!");
    }

    public static void playOrNot() {
        System.out.println("If you wanna play - press 'y', don't - press any key");

    }

    public static boolean checkWord( char[] hiddenWord) {
        boolean flag = false;
        while (!flag) {

            char[] word = getInput().nextLine().toCharArray();
            System.out.println("You entered: " + Arrays.toString(word));

            if (!Arrays.equals(hiddenWord, word)) {
                System.out.println("You have entered wrong word. Try again");
            } else {
                printWonMessage();
                flag = true;
            }
        }
        return true;

    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }

    public static String[] getArrayOfHiddenWord(){
        return new String[]{
                "Tree",
                "MacBook",
                "Apple"
        };
    }

    public static String getHiddenWord(){
        return getArrayOfHiddenWord()[new Random().nextInt(0, getArrayOfHiddenWord().length)];
    }

    public static void printHiddenWord(char[] hiddenWord){
        for (char letter : hiddenWord){
            System.out.print(" '"+letter+"' ");
        }
        System.out.println();
    }

    public static void getMessagePlay(){
        System.out.println("Hidden word has been set. We can start a game now");
        System.out.println("Down below you can see a hidden word. Try to guess it");
    }

    public static void inputRequest(){
        System.out.println("You can try to enter a full word or in letters");
        System.out.println("1. I want to enter a full word\n2. I want to enter by letters\n3. Quit tha game");

        }

}