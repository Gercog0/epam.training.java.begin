package by.training.hometask1.entity;

import java.util.Objects;

public class DateEmulator {
    private int seconds;
    private int minutes;
    private int hours;
    private int year;
    private int numberOfMonth;

    public DateEmulator() {
    }

    public DateEmulator(int numberOfMonth, int year) {
        this.numberOfMonth = numberOfMonth;
        this.year = year;
    }

    public DateEmulator(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    public void setNumberOfMonth(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateEmulator that = (DateEmulator) o;
        return seconds == that.seconds &&
                minutes == that.minutes &&
                hours == that.hours &&
                year == that.year &&
                numberOfMonth == that.numberOfMonth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seconds, minutes, hours, year, numberOfMonth);
    }

    public enum Months {
        JANUARY(31), FEBRUARY(28), FEBRUARY_LEAP(29), MARCH(31), APRIL(30),
        MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31),
        NOVEMBER(30), DECEMBER(31);

        private int days;

        Months(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }
}
