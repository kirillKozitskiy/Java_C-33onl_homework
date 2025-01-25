package lesson12.homework.secondTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegExPatterns {

    User user;

    public static boolean isPhoneNumberAcceptable(String phoneNumber) {
        Pattern phoneNumberPattern = Pattern.compile("^(\\d{4})-\\d{4}-\\d{2}|\\+\\(\\d{2}\\)\\d{7}");
        Matcher matcher = phoneNumberPattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isEmailAddressAcceptable(String email){
        Pattern emailAdresPattern = Pattern.compile("\\w{2,15}@\\w{4}\\.(ru|com)");
        Matcher emailAdresMatcher = emailAdresPattern.matcher(email);
        return emailAdresMatcher.matches();
    }

}
