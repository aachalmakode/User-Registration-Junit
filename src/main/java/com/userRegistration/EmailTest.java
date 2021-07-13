package com.userRegistration;

import org.junit.Assert;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailTest {
    String getEmailId;
    boolean isExpectedResult;

    private UserRegistration userRegistration;
    private boolean expectedResult;
    private String emailId;

    public void EmailTest(String emailId, boolean expectedResult) {
        this.expectedResult = expectedResult;
        this.emailId = emailId;

    }
  //  @Before
    public void initialize(){
        userRegistration= new UserRegistration();
    }


    @Parameterized.Parameters
    public static Collection emailIds_With_ExpectedResult(){
        return Arrays.asList(new Object[][]{
                {"abc.syz@bl.co.in", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@gmail.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }
    @Test
    public void givenEmailIds_WhenProper_ShouldReturnExpectedResult() {

        UserRegistration userRegistration = new UserRegistration();
        boolean actualResult = userRegistration.validateEmailId(emailId);
        Assert.assertEquals(this.expectedResult, userRegistration.validateEmailId(emailId));
    }


}