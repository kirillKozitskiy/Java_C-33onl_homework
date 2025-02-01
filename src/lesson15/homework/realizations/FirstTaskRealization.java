package lesson15.homework.realizations;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstTaskRealization {

    public FirstTaskRealization() {
        getGreetingMessage();
        getSetOfEnteredElements();
    }

    public void getSetOfEnteredElements() {
        Set<String> setOfElements = new HashSet<>();
        setOfElements.add(inputValue().nextLine());
        setOfElements.add(inputValue().nextLine());
        setOfElements.add(inputValue().nextLine());
        setOfElements.add(inputValue().nextLine());

        System.out.println(setOfElements);
    }

    public void getGreetingMessage(){
        System.out.println("\u001B[34mEnter some values. If there are repeated values," +
                "then they will be deleted from the list.\n" +
                "Example:\n Input 1, 1, 2, 3 " +
                "\n Output 1, 2, 3\u001B[0m");
    }

    private Scanner inputValue(){
        return new Scanner(System.in);
    }

}
