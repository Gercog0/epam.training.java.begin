package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.entity.DateEmulator;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.DateOperation;
import by.training.hometask1.validation.DateValidation;

public class TaskTwoMain {
    public static void main(String[] args) {
        DateValidation dateValidation = new DateValidation();
        DateOperation dateOperation = new DateOperation();

        int numberMonth = 2;
        int year = 1996;

        CheckException.checkForException(dateValidation.checkNumberOfMonth(numberMonth));
        CheckException.checkForException(dateValidation.checkYear(year));

        DateEmulator dateEmulator = new DateEmulator(numberMonth, year);

        OutputConsole.print("Is a year " + dateEmulator.getYear() + " is a leap? " +
                dateOperation.isLeapYear(dateEmulator.getYear()));
        OutputConsole.print("Quantity days by number of month: "
                + dateOperation.getQuantityDaysInMonth(dateEmulator));
    }
}
