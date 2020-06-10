package validator;

import by.training.hometask1.validator.NumberValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {
    NumberValidator numberValidator;

    @BeforeClass
    public void setUp() {
        numberValidator = new NumberValidator();
    }

    @Test
    public void checkCubeIsSix_valid() {
        double number = 9;
        boolean condition = numberValidator.checkCubeIsSix(number);
        assertTrue(condition);
    }

    @Test
    public void checkCubeIsSix_invalid() {
        double number = Math.cbrt(6);
        boolean condition = numberValidator.checkCubeIsSix(number);
        assertFalse(condition);
    }

    @Test
    public void checkForPositiveNumbersInArrayInteger_valid() {
        int number_one = 15;
        int number_two = 30;
        int number_three = 991;
        boolean condition = numberValidator.checkForPositiveNumbersInArray(
                number_one, number_two, number_three);
        assertTrue(condition);
    }

    @Test
    public void checkForPositiveNumbersInArrayInteger_invalid() {
        int number_one = -21;
        int number_two = 2;
        int number_three = 21;
        boolean condition = numberValidator.checkForPositiveNumbersInArray(
                number_one, number_two, number_three);
        assertFalse(condition);
    }

    @Test
    public void checkForPositiveNumbersInArrayDouble_valid() {
        double number_one = 1.14;
        double number_two = 30.23324;
        double number_three = 99112.342;
        boolean condition = numberValidator.checkForPositiveNumbersInArray(
                number_one, number_two, number_three);
        assertTrue(condition);
    }

    @Test
    public void checkForPositiveNumbersInArrayDouble_invalid() {
        double number_one = -21.32423;
        double number_two = -0;
        double number_three = 3424.234;
        boolean condition = numberValidator.checkForPositiveNumbersInArray(
                number_one, number_two, number_three);
        assertFalse(condition);
    }

    @AfterClass
    public void tierDown() {
        numberValidator = null;
    }
}
