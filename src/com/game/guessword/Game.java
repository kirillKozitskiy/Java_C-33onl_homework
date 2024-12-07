package com.game.guessword;

public class Game {
    public static void main(String[] args) {


    }

    public static void welcome(){
        System.out.println("Welcome to the guess a word gave");
        System.out.println("The instruction are the following\n" +
                "If you enter a letter, we will check if there is a match\n" +
                "If there is, we open it on the table and game moves on\n" +
                "If not try again");
    }

    public static String[] getArrayOfWords(){
        return new String[]{
                "laptop",
                "apple",
                "meeting",
                "Georgia",
                "Housewife",
                "Universe"

        };
    }


}
