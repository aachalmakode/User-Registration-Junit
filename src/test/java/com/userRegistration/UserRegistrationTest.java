package com.userRegistration;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    private UserRegistration userRegistration;

    @Before
public void setUp() {

    userRegistration = new UserRegistration();
}

//first name
    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        boolean actual = this.userRegistration.validateFirstName("Aaaaaaa");
        Assert.assertTrue(actual);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean actual = this.userRegistration.validateFirstName("Ayyyya");
        Assert.assertFalse(actual);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean actual = this.userRegistration.validateFirstName("a1");
        Assert.assertFalse(actual);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean actual = this.userRegistration.validateFirstName("Aachal@");
        Assert.assertFalse(actual);
    }
    //last name
    @Test
    public void givenLastName_WhenLastLatterUpperCase_ShouldReturnTrue() {
        boolean actual = this.userRegistration.validateLastName("Mako");
        Assert.assertTrue(actual);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean actual = userRegistration.validateLastName("Ma");
        Assert.assertFalse(actual);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean actual = userRegistration.validateLastName("Mako1");
        Assert.assertFalse(actual);
    }

    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean actual = userRegistration.validateFirstName("Mako@");
        Assert.assertFalse(actual);
    }

    //email
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean actual = userRegistration.validateEmailId("aachal.lk@mako.co.in");
        Assert.assertTrue(actual);
    }
    //mobile number
    @Test
    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean actual = userRegistration.validateMobileNumber("91 992223277499");
        Assert.assertTrue(actual);
    }
    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean actual = userRegistration.validateMobileNumber("919960077482");
        Assert.assertFalse(actual);
    }

    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        boolean actual = userRegistration.validateMobileNumber("9960077482");
        Assert.assertFalse(actual);
    }

    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("1234507748");
        Assert.assertFalse(result);
    }

    //passwords rule1
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean actual = userRegistration.validatePassword("nDDj1k2*jf");
        Assert.assertTrue(actual);
    }

    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean actual = userRegistration.validatePassword("3Rmdg*n");
        Assert.assertTrue(actual);
    }
    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean actual = userRegistration.validatePassword("Mas8bt&Bx");
        Assert.assertTrue(actual);
    }
    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean actual = userRegistration.validatePassword("mDkk%fDB");
        Assert.assertFalse(actual);
    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean actual = userRegistration.validatePassword("mDkk%fD1");
        Assert.assertTrue(actual);
    }
    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
        boolean actual = userRegistration.validatePassword("mDkkfD12");
        Assert.assertFalse(actual);
    }
    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        boolean actual = userRegistration.validatePassword("jjDkk@fee1");
        Assert.assertFalse(actual);
    }
}

