package lesson13.exceptionHomework;

import lesson13.exceptionHomework.exceptions.ConfirmPasswordException;
import lesson13.exceptionHomework.exceptions.LoginException;
import lesson13.exceptionHomework.exceptions.PasswordException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidator {

    public static void checkUserInformation(UserInformation userInfo) throws LoginException, PasswordException {
        try{
            checkLogin(userInfo.getLogin());
        }
        catch(LoginException e){
            System.out.println(e.getMessage());
            logException(e);
            userInfo.setLogin("None");
        }
        try {
            checkPassword(userInfo.getPassword());
        }
        catch(PasswordException e){
            System.out.println(e.getMessage());
            logException(e);
            userInfo.setPassword("None");
        }
        try {
            checkConfirmPassword(userInfo.getPassword(), userInfo.getConfirmPassword());
        }
        catch (ConfirmPasswordException e){
            System.out.println(e.getMessage());
            logException(e);
            userInfo.setPassword("None");
            userInfo.setConfirmPassword("None");
        }
    }

    public static void checkPassword(String password) throws PasswordException {
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(password);

        if(password.length() < 20 && !password.contains(" ") && matcher.matches()) {
            System.out.println("Password is correct");
        }
        else {
            throw new PasswordException("Wrong password exception");
        }
    }

    public static void checkLogin(String login) throws LoginException {
        if(login.length() < 20 && !login.contains(" ")) {
            System.out.println("Login is correct");
        }
        else {
            throw new LoginException("Wrong login exception");
        }
    }

    public static void checkConfirmPassword(String password, String confirmPassword) throws ConfirmPasswordException {
        if(password.equals(confirmPassword)) {
            System.out.println("Password and confirm password are correct");
        }
        else {
            throw new ConfirmPasswordException("Confirm password exception");
        }
    }

    public static void logException(Exception e) {
        try(FileWriter fileWriter = new FileWriter("src/lesson13/exceptionHomework/ListOfExceptions.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter)){
            printWriter.println(e.getMessage());
        }
        catch (IOException exception){
            System.out.println("Error while recording "+e.getMessage());
        }



    }




}
