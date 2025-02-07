package lesson17.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Homework {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

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

    private Scanner getScanner(){
        return new Scanner(System.in);
    }


}
