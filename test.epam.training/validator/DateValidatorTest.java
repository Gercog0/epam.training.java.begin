package validator;

import by.training.hometask1.validator.DateValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateValidatorTest {
    DateValidator dateValidator;

    @BeforeClass
    public void setUp() {
        dateValidator = new DateValidator();
    }

    @Test
    public void checkYear_valid() {
        int year = 2000;
        boolean condition = dateValidator.checkYear(year);
        assertTrue(condition);
    }

    @Test
    public void checkYear_negativeYear_invalid() {
        int year = -21;
        boolean condition = dateValidator.checkYear(year);
        assertFalse(condition);
    }

    @Test
    public void checkNumberOfMonth_valid() {
        int month = 7;
        boolean condition = dateValidator.checkNumberOfMonth(month);
        assertTrue(condition);
    }

    @Test
    public void checkNumberOfMonth_negativeMonth_invalid() {
        int month = -7;
        boolean condition = dateValidator.checkNumberOfMonth(month);
        assertFalse(condition);
    }

    @Test
    public void checkNumberOfMonth_incorrectMonth_invalid() {
        int month = 99;
        boolean condition = dateValidator.checkNumberOfMonth(month);
        assertFalse(condition);
    }

    @Test
    public void checkSecondsInDay_valid() {
        int seconds = 3600;
        boolean condition = dateValidator.checkSecondsInDay(seconds);
        assertTrue(condition);
    }

    @Test
    public void checkSecondsInDay_negativeValue_invalid() {
        int seconds = -21;
        boolean condition = dateValidator.checkSecondsInDay(seconds);
        assertFalse(condition);
    }

    @Test
    public void checkSecondsInDay_incorrectValue_invalid() {
        int seconds = 999999;
        boolean condition = dateValidator.checkSecondsInDay(seconds);
        assertFalse(condition);
    }

    @AfterClass
    public void tierDown() {
        dateValidator = null;
    }
}
