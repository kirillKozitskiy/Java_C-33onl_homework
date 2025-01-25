package lesson12.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTaskWithAbbreviation {
    public static void main(String[] args) {

        System.out.println("\u001B[34mPlease, enter the line to determine if it's an abbreviation.\u001B[0m");
        String line = inputLine().nextLine();

        List<String> abbreviations = returnAbbreviationWordsFromTheLine(line);
        System.out.println();
        System.out.println("\u001B[34mList of abbreviations\u001B[0m");
        abbreviations.forEach(System.out::println);

        inputLine().close();
    }

    public static List<String> returnAbbreviationWordsFromTheLine(String line) {
        String[] words = line.split(" ");
        List<String> abbreviations = new ArrayList<>();

        Pattern isAbbriviationPattern = Pattern.compile("^[A-Z]{2,6}");

        for (String word : words) {
            Matcher isAbbriviationMatcher = isAbbriviationPattern.matcher(word);
            if(isAbbriviationMatcher.matches()) {
                System.out.println("It IS an abbreviation -> " + word);
                abbreviations.add(word);
            }
            else {
                System.out.println("It ISN'T an abbreviation -> " + word);
            }
        }
        return abbreviations;
    }

    public static Scanner inputLine(){
        return new Scanner(System.in);
    }
}
