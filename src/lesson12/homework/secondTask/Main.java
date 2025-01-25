package lesson12.homework.secondTask;


/*
1. Data request.
2. Input
3. Validation
4. Data storage
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();

        //Output text to explain what have to be entered
        requestUserInformation();

        //Getting and Adding user info in List
        userList.add(getUserData());

        System.out.println(userList);
    }



    public static void requestUserInformation(){
        System.out.println("You must be verified");
        System.out.println("Please enter your name, last name, email and phone number down bellow.");
    }

    public static User getUserData(){
        User user = new User();

        String phoneNumber;
        String email;

        System.out.print("Name: ");
        user.setFirstName(inputData().nextLine());

        System.out.print("Last Name: ");
        user.setLastName(inputData().nextLine());

        System.out.print("Email: ");
        email = inputData().nextLine();
        if(UserRegExPatterns.isEmailAddressAcceptable(email)){
            user.setEmail(email);
        }
        else {
            user.setEmail("Null");
        }

        System.out.print("Phone Number: ");
        phoneNumber = inputData().nextLine();
        if(UserRegExPatterns.isPhoneNumberAcceptable(phoneNumber)){
            user.setPhoneNumber(phoneNumber);
        }
        else {
            user.setPhoneNumber("Null");
        }

        return user;

    }

    public static Scanner inputData(){
        return new Scanner(System.in);
    }





}


