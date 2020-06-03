package by.training.hometask1.service;

import by.training.hometask1.entity.DateEmulator;

public class DateOperation {
    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public int getQuantityDaysInMonth(DateEmulator dateEmulator) {
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

    public int calculateMinutes(int number) {
        return (number - calculateHours(number) * 3600) / 60;
    }

    public int calculateSeconds(int number) {
        return (number - calculateHours(number) * 3600) % 60;
    }

    public int calculateHours(int number) {
        return number / 3600;
    }
}
