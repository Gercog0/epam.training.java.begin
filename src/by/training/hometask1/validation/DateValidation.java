package by.training.hometask1.validation;

public class DateValidation {
    public boolean checkNumberOfMonth(int month) {
        return month >= 1 && month <= 12;
    }

    /**
     * Checking year for leap year...
     */
    public boolean checkYear(int year) {
        return year >= 1582;
    }
}
