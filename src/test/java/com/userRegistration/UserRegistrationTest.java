package com.userRegistration;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    private UserRegistration userRegistration;

    @Before
public void serUp() {

    userRegistration = new UserRegistration();
}
    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        boolean actual = this.userRegistration.validateFirstName("Aachal");
        Assert.assertTrue(actual);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean actual = this.userRegistration.validateFirstName("aa");
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

}