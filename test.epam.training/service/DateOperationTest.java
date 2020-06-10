package service;

import by.training.hometask1.entity.DateEmulator;
import by.training.hometask1.exception.UserException;
import by.training.hometask1.service.DateOperation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateOperationTest {
    DateOperation dateOperation;

    @BeforeClass
    public void setUp() {
        dateOperation = new DateOperation();
    }

    @Test
    public void isLeapYear_valid() {
        int year = 1996;
        try {
            boolean condition = dateOperation.isLeapYear(year);
            assertTrue(condition);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void isLeapYear_invalid() throws UserException {
        int year = -21;
        dateOperation.isLeapYear(year);
    }

    @Test
    public void calculateQuantityDaysInMonth_valid() {
        int numberOfMonth = 2;
        int year = 2000;
        DateEmulator dateEmulator = new DateEmulator(numberOfMonth, year);
        try {
            int expected = 29;
            int actual = dateOperation.calculateQuantityDaysInMonth(dateEmulator);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateQuantityDaysInMonth_invalid() throws UserException {
        int numberOfMonth = 36;
        int year = 0;
        DateEmulator dateEmulator = new DateEmulator(numberOfMonth, year);
        dateOperation.calculateQuantityDaysInMonth(dateEmulator);

    }

    @Test
    public void calculateMinutes_valid() {
        try {
            int seconds = 3661;
            int expected = 1;
            int actual = dateOperation.calculateMinutes(seconds);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateMinutes_invalid() throws UserException {
        int seconds = -512;
        dateOperation.calculateMinutes(seconds);
    }

    @Test
    public void calculateSeconds_valid() {
        try {
            int seconds = 3621;
            int expected = 21;
            int actual = dateOperation.calculateSeconds(seconds);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateSeconds_invalid() throws UserException {
        int seconds = -9999;
        dateOperation.calculateSeconds(seconds);
    }

    @Test
    public void calculateHours_valid() {
        try {
            int seconds = 3615;
            int expected = 1;
            int actual = dateOperation.calculateHours(seconds);
            assertEquals(actual, expected);
        } catch (UserException ex) {
            fail("Exception...");
        }
    }

    @Test(expectedExceptions = UserException.class)
    public void calculateHours_invalid() throws UserException {
        int seconds = -3421;
        dateOperation.calculateHours(seconds);
    }

    @AfterClass
    public void tierDown() {
        dateOperation = null;
    }
}
