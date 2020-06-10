package service;

import by.training.hometask1.exception.UserException;
import by.training.hometask1.service.NumberOperation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberOperationTest {
    NumberOperation numberOperation;

    @BeforeClass
    public void setUp() {
        numberOperation = new NumberOperation();
    }

    @Test
    public void calculateLastDigitOfNumber_valid() {
        try {
            int number = 99;
            int expected = 9;
            int actual = numberOperation.calculateLastDigitOfNumber(number);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateLastDigitOfNumber_invalid() throws UserException {
        int number = -44;
        numberOperation.calculateLastDigitOfNumber(number);
    }

    @Test
    public void calculateLastDigitOfNumberSquare_valid() {
        try {
            int number = 99;
            int expected = 1;
            int actual = numberOperation.calculateLastDigitOfNumberSquare(number);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateLastDigitOfNumberSquare_invalid() throws UserException {
        int number = -44;
        numberOperation.calculateLastDigitOfNumberSquare(number);
    }

    @Test
    public void isTwoNumberEven_valid() {
        try {
            int number_one = 15;
            int number_two = 11;
            int number_three = 6;
            int number_four = 2;
            boolean condition = numberOperation.isTwoNumberEven(number_one,
                    number_two, number_three, number_four);
            assertTrue(condition);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test
    public void isTwoNumberEven_invalid() {
        try {
            int number_one = 15;
            int number_two = 11;
            int number_three = 7;
            int number_four = 2;
            boolean condition = numberOperation.isTwoNumberEven(number_one,
                    number_two, number_three, number_four);
            assertFalse(condition);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void isTwoNumberEven_incorrectData_invalid() throws UserException {
        int number_one = -15;
        int number_two = 11;
        int number_three = -7;
        int number_four = 0;
        numberOperation.isTwoNumberEven(number_one, number_two, number_three, number_four);
    }

    @Test
    public void isNumberPerfect_valid() {
        try {
            int number = 28;
            boolean condition = numberOperation.isNumberPerfect(number);
            assertTrue(condition);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test
    public void isNumberPerfect_invalid() {
        try {
            int number = 30;
            boolean condition = numberOperation.isNumberPerfect(number);
            assertFalse(condition);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void isNumberPerfect_incorrectData_invalid() throws UserException {
        int number = -231241;
        numberOperation.isNumberPerfect(number);
    }

    @Test
    public void calculateEquationOne_valid() {
        double xValue = 0;
        double expected = 9;
        double actual = numberOperation.calculateEquationOne(xValue);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateEquationOne_invalid() {
        double xValue = 0;
        double expected = 23252;
        double actual = numberOperation.calculateEquationOne(xValue);
        assertNotEquals(actual, expected);
    }

    @Test
    public void calculateEquationTwo_valid() {
        try {
            double xValue = 2;
            double expected = 0.5;
            double actual = numberOperation.calculateEquationTwo(xValue);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception");
        }
    }

    @Test
    public void calculateEquationTwo_invalid() {
        try {
            double xValue = 2;
            double expected = 20;
            double actual = numberOperation.calculateEquationTwo(xValue);
            assertNotEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateEquationTwo_divisionByZero_invalid() throws UserException {
        double xValue = Math.cbrt(6);
        numberOperation.calculateEquationTwo(xValue);
    }

    @Test
    public void calculateResultDependingOnXValue_valid() {
        try {
            double xValue = 3;
            double expected = 9;
            double actual = numberOperation.calculateResultDependingOnXValue(xValue);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception");
        }
    }

    @Test
    public void calculateResultDependingOnXValue_invalid() {
        try {
            double xValue = 2;
            double expected = 9;
            double actual = numberOperation.calculateResultDependingOnXValue(xValue);
            assertNotEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateResultDependingOnXValue_divisionByZero_invalid() throws UserException {
        double xValue = Math.cbrt(6);
        numberOperation.calculateResultDependingOnXValue(xValue);
    }

    @AfterClass
    public void tierDown() {
        numberOperation = null;
    }
}
