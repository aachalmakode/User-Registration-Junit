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

    static boolean validatePassword(String password) {
        String passwordRegex =  "^(?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";


        if (Pattern.compile(passwordRegex).matcher(password).matches() &&

                Pattern.compile(".[A-Z].").matcher(password).matches() &&
                Pattern.compile(".[0-9].").matcher(password).matches() &&

                password.length() - password.replaceAll("\\W", "").length() == 1)

            System.out.println("Valid");


        else

            System.out.println("Password should contain min 8 characters, atleast 1 uppercase, atleast 1 numeric number and exactly 1 special character.");

        return false;
    }
}