package com.bitwise.ExceptionHandling;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void validateFirstNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateFirstName.validate("Devika");
        Assert.assertTrue(actualOutput);
        System.out.println("First Name 'Devika' is Valid");
        System.out.println(actualOutput);
    }

    // negative test case for firstName
    @Test
    public void validateFirstNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateFirstName.validate("devika");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid First Name", exception.getMessage());
            System.out.println("Invalid First Name");
        }

    }

    // positive test case for lastName
    @Test
    public void validateLastNameTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateLastName.validate("Karpe");
        Assert.assertTrue(actualOutput);
        System.out.println("Last Name 'Karpe' is Valid");
        System.out.println(actualOutput);
    }

    //    // negative test case for lastName
    @Test
    public void validateLastNameTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateLastName.validate("karpe");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Last Name", exception.getMessage());
            System.out.println("Invalid last Name");
        }
    }

    //
    // positive test case for email
    @Test
    public void validateEmailTestReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateEmail.validate("devi18@gamil.com");
        Assert.assertTrue(actualOutput);
        System.out.println("Email Id is Valid");
        System.out.println(actualOutput);
    }

    // negative test case for email
    @Test
    public void validateEmailTestReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateEmail.validate("abc@@in.");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Email", exception.getMessage());
            System.out.println("Invalid Email");
        }
    }

    // positive test case for mobile number
    @Test
    public void validateMobileNumberReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validateMobileNumber.validate("+91 8080031836");
        Assert.assertTrue(actualOutput);
        System.out.println("Mobile Number is Valid");
        System.out.println(actualOutput);
    }

    // negative test case for mobile number
    @Test
    public void validateMobileNumberReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateMobileNumber.validate("+91 941023");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Mobile Number", exception.getMessage());
            System.out.println("Invalid Mobile Number");
        }
    }

    // positive test case for password
    @Test
    public void validatePasswordReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean actualOutput = userRegistration.validatePassword.validate("GoodLuckd@16");
        Assert.assertTrue(actualOutput);
        System.out.println("Password is Valid");
        System.out.println(actualOutput);
    }

    // negative test case for password
    @Test
    public void validatePasswordReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validatePassword.validate("good@.");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Password", exception.getMessage());
            System.out.println("Invalid Password");
        }
    }
}

