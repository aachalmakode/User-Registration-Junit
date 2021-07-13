package com.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {


        public boolean CheckFirstName(String firstName) throws UserRegistrationException {

            if (firstName.matches("^[A-Z]{1}[a-z]{2,}$"))
                return true;
            else
                throw new UserRegistrationException ("Invalid First Name");
        }

        public boolean CheckLastName(String lastName) throws  UserRegistrationException {

            if (lastName.matches("^[A-Z]{1}[a-z]{2,}$"))
                return true;
            else
                throw new UserRegistrationException ("Invalid last Name");
        }

        public boolean Email(String email) throws  UserRegistrationException{

            if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
                return true;
            else
                throw new  UserRegistrationException("Invalid Email");
        }

        public boolean PhoneNumber(String phoneNumber) throws  UserRegistrationException{

            if (phoneNumber.matches("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$"))
                return true;
            else
                throw new  UserRegistrationException("Invalid Phone Number");
        }

        public boolean Password(String password) throws   UserRegistrationException{

            if (password.matches("^(?=.*[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])[A-Za-z0-9!@#$%^&*?]{8,}$"))
                return true;
            else
                throw new  UserRegistrationException("Invalid Password");
        }
    }
