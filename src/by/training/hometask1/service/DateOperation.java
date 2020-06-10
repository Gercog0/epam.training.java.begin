package by.training.hometask1.service;

import by.training.hometask1.entity.DateEmulator;
import by.training.hometask1.exception.UserException;
import by.training.hometask1.validator.DateValidator;

public class DateOperation {
    private static final int HOUR_IN_SECONDS = 3600;
    private static final int MINUTE_IN_SECONDS = 60;

    public boolean isLeapYear(int year) throws UserException {
        DateValidator dateValidator = new DateValidator();
        if (!dateValidator.checkYear(year)) {
            throw new UserException("Incorrect data...");
        }
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public int calculateQuantityDaysInMonth(DateEmulator dateEmulator) throws UserException {
        DateValidator dateValidator = new DateValidator();
        if (!dateValidator.checkNumberOfMonth(dateEmulator.getNumberOfMonth())
                || !dateValidator.checkYear(dateEmulator.getYear())) {
            throw new UserException("Incorrect data...");
        }
        int quantity = 0;
        switch (dateEmulator.getNumberOfMonth()) {
            case 1:
                quantity = DateEmulator.Months.JANUARY.getDays();
                break;
            case 2:
                if (isLeapYear(dateEmulator.getYear())) {
                    quantity = DateEmulator.Months.FEBRUARY_LEAP.getDays();
                } else {
                    quantity = DateEmulator.Months.FEBRUARY.getDays();
                }
                break;
            case 3:
                quantity = DateEmulator.Months.MARCH.getDays();
                break;
            case 4:
                quantity = DateEmulator.Months.APRIL.getDays();
                break;
            case 5:
                quantity = DateEmulator.Months.MAY.getDays();
                break;
            case 6:
                quantity = DateEmulator.Months.JUNE.getDays();
                break;
            case 7:
                quantity = DateEmulator.Months.JULY.getDays();
                break;
            case 8:
                quantity = DateEmulator.Months.AUGUST.getDays();
                break;
            case 9:
                quantity = DateEmulator.Months.SEPTEMBER.getDays();
                break;
            case 10:
                quantity = DateEmulator.Months.OCTOBER.getDays();
                break;
            case 11:
                quantity = DateEmulator.Months.NOVEMBER.getDays();
                break;
        }
        return quantity;
    }

    public int calculateMinutes(int number) throws UserException {
        DateValidator dateValidator = new DateValidator();
        if (!dateValidator.checkSecondsInDay(number)) {
            throw new UserException("Incorrect data...");
        }
        return (number - calculateHours(number) * HOUR_IN_SECONDS) / MINUTE_IN_SECONDS;
    }

    public int calculateSeconds(int number) throws UserException {
        DateValidator dateValidator = new DateValidator();
        if (!dateValidator.checkSecondsInDay(number)) {
            throw new UserException("Incorrect data...");
        }
        return (number - calculateHours(number) * HOUR_IN_SECONDS) % MINUTE_IN_SECONDS;
    }

    public int calculateHours(int number) throws UserException {
        DateValidator dateValidator = new DateValidator();
        if (!dateValidator.checkSecondsInDay(number)) {
            throw new UserException("Incorrect data...");
        }
        return number / HOUR_IN_SECONDS;
    }
}
