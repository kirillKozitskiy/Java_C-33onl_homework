package lesson13.exceptionHomework;

import lesson13.exceptionHomework.exceptions.LoginException;
import lesson13.exceptionHomework.exceptions.PasswordException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PasswordException, LoginException {

        UserInformation userInformation = new UserInformation();

        System.out.print("Enter login: ");
        userInformation.setLogin(getInput().nextLine());

        System.out.print("Enter password: ");
        userInformation.setPassword(getInput().nextLine());

        System.out.println("Enter confirm password: ");
        userInformation.setConfirmPassword(getInput().nextLine());

        UserInputValidator.checkUserInformation(userInformation);

        System.out.println("Login: " + userInformation.getLogin());
        System.out.println("Password: " + userInformation.getPassword());
        System.out.println("Confirm password: " + userInformation.getConfirmPassword());

        getInput().close();


    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

}
