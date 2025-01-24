package lesson12.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {

        System.out.println("Please, enter the line to determine if it's an abbreviation.");
        String line = inputLine().nextLine();
        String[] words = line.split(" ");

        Pattern isAbbriviationPattern = Pattern.compile("^[A-Z]{2,6}");

        for (String word : words) {
            Matcher isAbbriviationMatcher = isAbbriviationPattern.matcher(word);
            if(isAbbriviationMatcher.matches()) {
                System.out.println("It IS an abbreviation -> " + word);
            }
            else {
                System.out.println("It ISN'T an abbreviation -> " + word);
            }
        }
        inputLine().close();






    }

    public static Scanner inputLine(){
        return new Scanner(System.in);
    }
}
