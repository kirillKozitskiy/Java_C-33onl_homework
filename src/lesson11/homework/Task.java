package lesson11.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task {


    public void startFirstTask(){

        System.out.println("----------FIRST TASK----------\n");
        getFirstTaskCondition();

        System.out.println("Enter 3 lines");
        String[] lines = new String[3];

        for(int i = 0 ; i < lines.length ; i++){
            lines[i] = inputLine().nextLine();
        }

        for(String line : lines){
            System.out.println(line+" -> length = "+line.length());
        }
    }

    public void startSecondTask(){
        System.out.println("----------SECOND TASK----------\n");
        getSecondTaskCondition();

        System.out.println("Enter 3 lines");
        String[] lines = new String[3];

        for(int i = 0 ; i < lines.length ; i++){
            lines[i] = inputLine().nextLine();
        }

        //First time I tried without a comparator but quickly found out that it would compare alphabetically
        //So I came to the conclusion that we need to use a Comparator Interface and an anonymous class
        Arrays.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println(Arrays.toString(lines));

    }

    public void startThirdTask(){
        System.out.println("----------THIRD TASK----------\n");
        getThirdTaskCondition();

        System.out.println("Enter 3 lines");
        String[] lines = new String[3];
        int totalLength = 0;

        for(int i = 0 ; i < lines.length ; i++){
            lines[i] = inputLine().nextLine();
        }

        for(int i = 0 ; i < lines.length ; i++){
            totalLength += lines[i].length();
            if(lines[i].length() < totalLength){
                System.out.println(lines[i]+" -> length = "+lines[i].length());
            }
        }





    }

    public void startFourthTask(){
        System.out.println("----------FOURTH TASK----------");
        getFourthTaskCondition();

        System.out.println("Enter 3 lines");
        String[] lines = new String[3];

        for(int i = 0 ; i < lines.length ; i++){
            lines[i] = inputLine().nextLine();
        }
        for(String line : lines){
            if(hasUniqueCharacters(line)){
                System.out.println(line+" -> length = "+line.length());
                return;
            }
        }
        System.out.println("We don't have a unique character line");


    }

    public void startFifthTask(){
        System.out.println("----------FIFTH TASK----------");
        getFifthTaskCondition();

        System.out.println("Enter 1 line");

        String line = inputLine().nextLine();
        StringBuilder lineBuilder = new StringBuilder();

        for(char el: line.toCharArray() )
        {
            lineBuilder.append(el).append(el);
        }
        System.out.println(lineBuilder.toString());







    }

    public void startSixthTask(){
        System.out.println("----------SIXTH TASK----------");
        getSixthTaskCondition();

        System.out.println("Enter line to check if it's a palindrome");

        String line = inputLine().nextLine();

        System.out.println("Is entered line a palindrome  -> "+isLineAPalindrome(line));
    }

    public void startSeventhTask(){
        System.out.println("----------SEVENTH TASK----------");
        getSeventhTaskCondition();

        System.out.println("Enter phrase to check if there is a palindrome");

        String[] words = inputLine().nextLine().split(" ");
        int length = words.length;

        System.out.println("Choose a word to check if it is a palindrome");
        //subtract 1 to avoid an exception
        int wordNum = inputLine().nextInt()-1;

        if(isChosenWordAvailable(wordNum, length)){
            String word = words[wordNum];

            if(isLineAPalindrome(word)){
                System.out.println(word+" -> palindrome");
            }
            else{
                System.out.println(word+" -> not a palindrome");
            }
        }
        else{
            System.out.println("You entered an invalid word number.");
        }

    }

    private boolean isChosenWordAvailable(int wordNum, int length){
        return wordNum < length && wordNum >= 0;
    }

    private boolean isLineAPalindrome(String line){

        StringBuilder lineBuilder = new StringBuilder(line);
        String reverseLine = lineBuilder.reverse().toString();

        return line.equals(reverseLine);

        //We can also write it by hand
        /*
        int left = 0;
        int right = reverseLine.length-1

        while(left<right){
            if(line.charAt(left) != line.charAt(right)){
            return false
            }
            left++
            right--
        }
        return true;
         */

    }

    private boolean hasUniqueCharacters(String line){
        int length = line.length();
        for(int i = 0 ; i < length ; i++){
            char currentChar = line.charAt(i);
            for(int j = i + 1 ; j < length ; j++){
                if(currentChar == line.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    private Scanner inputLine(){
        return new Scanner(System.in);
    }

    private void getFirstTaskCondition(){
        System.out.println("\u001B[34mВвести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести найденные " +
                "строки и их длину.\u001B[0m");
    }

    private void getSecondTaskCondition(){
        System.out.println("\u001B[34mВвести 3 строки с консоли. Упорядочить и вывести строки " +
                "в порядке возрастания.\u001B[0m");
    }

    private void getThirdTaskCondition(){
        System.out.println("\u001B[34mВвести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, " +
                "а также их длину.\u001B[0m");
    }

    private void getFourthTaskCondition(){
        System.out.println("\u001B[34mВвести 3 строки с консоли. Найти слово состоящее только из различных символов." +
                " Если таких слов несколько, найти первое из них.\u001B[0m");
    }

    private void getFifthTaskCondition(){
        System.out.println("\u001B[34mВывести на консоль новую строку, в которой задублирована каждая буква " +
                "из начальной строки. Например: Hello -> HHeelllloo\u001B[0m");
    }

    private void getSixthTaskCondition(){
        System.out.println("\u001B[34mЯ случайно выдумал это задание.\u001B[0m");
    }

    private void getSeventhTaskCondition(){
        System.out.println("\u001B[34mДана строка произвольной длины с произвольными словами. Написать программу для" +
                " проверки, является ли любое выбранное слово в строке палиндроном.\\nНапример, есть строка," +
                " вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.\u001B[0m");
    }


}
