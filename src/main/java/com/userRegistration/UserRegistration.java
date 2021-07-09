package com.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {


    static boolean validateFirstName(String name) {
        String nameRegex = "^[A-Z][a-z]{2,}$";
        if (Pattern.compile(nameRegex).matcher(name).matches())
            System.out.println("Valid");
        else

            System.out.println("Name should start with capital letter and need min 3 characters.");
        return false;
    }

    static boolean validateLastName(String name) {
        String nameRegex = "^[A-Z][a-z]{2,}$";
        if (Pattern.compile(nameRegex).matcher(name).matches())
            System.out.println("Valid");
        else

            System.out.println("Name should start with capital letter and need min 3 characters.");
        return false;
    }
    static boolean validateEmailId(String email) {
        String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";

        if (Pattern.compile(emailRegex).matcher(email).matches())
            System.out.println("Valid");
        else
            System.out.println("Invalid email id");

        return false;
    }

    static boolean validateMobileNumber(String number) {
        String mobNoRegex = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";

        if (Pattern.compile(mobNoRegex).matcher(number).matches())
            System.out.println("Valid");
        else
            System.out.println("Mobile number should contain country code follow by space and 10 digit number.");

        return false;
    }

}