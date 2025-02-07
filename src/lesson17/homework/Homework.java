package lesson17.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Homework {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final double exchangeRate = 3.37;

    public void firstTask(){
        System.out.println("Enter the birthday date");
        String birthdayDate = getScanner().nextLine();
        try {
            LocalDate birthday = LocalDate.parse(birthdayDate, DATE_TIME_FORMATTER);
            LocalDate today = LocalDate.now();
            LocalDate hundredBirthday = birthday.plusYears(100);

            if(today.isAfter(hundredBirthday)){
                System.out.println("You are past 100 years old...");
            }
            else {
                int i = hundredBirthday.getYear() - today.getYear();
                System.out.println("You're "+i+" years away from being 100");
            }

        }
        catch (DateTimeParseException e){
            System.out.println("Invalid birthday date");
        }
    }

    public void secondTask(){
        int[] arrayOfNumbers = {10,-3,24,-4,32,2,-3,-54};

        List<Integer> numbers = IntStream
                .of(arrayOfNumbers)
                .boxed()
                .toList();

        //It's a functional interface, so we can use lambda expression
        Predicate<Integer> positive = num -> num > 0;

        List<Integer> filteredNumbers = numbers.stream()
                .filter(positive)
                .toList();
        filteredNumbers.forEach(n -> System.out.print(n+" "));
    }

    public void thirdTask(){

        Pattern pattern = Pattern.compile("^(?i)\\d+ BYN$");
        System.out.println("Enter the sum of money you want to convert\n" +
                "EXAMPLE: 56 BYN");
        String money = getScanner().nextLine();
        Matcher matcher = pattern.matcher(money);

        if (matcher.matches()){
            Function<String, Double> convertToUSD = amountStr ->{
                String amountWithoutBYN = amountStr.split(" ")[0];
                double amount = Double.parseDouble(amountWithoutBYN);
                return amount * exchangeRate;
            };
            double convertedUSD = convertToUSD.apply(money);
            System.out.println("Converted USD: "+convertedUSD);
        }
        else
            System.out.println("Invalid sum of money you want to convert");

    }

    private Scanner getScanner(){
        return new Scanner(System.in);
    }


}
