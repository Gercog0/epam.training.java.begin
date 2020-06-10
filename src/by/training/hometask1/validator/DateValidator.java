package by.training.hometask1.validator;

public class DateValidator {
    private static final int SECONDS_ID_DAY = 86400;
    private static final int BEGIN_LEAP_CALCULATE = 1582;
    public boolean checkNumberOfMonth(int month) {
        return month >= 1 && month <= 12;
    }

    /**
     * Checking year for leap year...
     */
    public boolean checkYear(int year) {
        return year >= BEGIN_LEAP_CALCULATE;
    }

    public boolean checkSecondsInDay(int seconds){
        return seconds >= 0 && seconds < SECONDS_ID_DAY;
    }
}
