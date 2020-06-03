package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.entity.DateEmulator;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.DateOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskSixMain {
    public static void main(String[] args) {
        DateOperation dateOperation = new DateOperation();
        NumberValidation numberValidation = new NumberValidation();

        int number = 36071;

        CheckException.checkForException(numberValidation.checkForPositiveNumber(number));

        DateEmulator dateEmulator = new DateEmulator(dateOperation.calculateSeconds(number),
                dateOperation.calculateMinutes(number), dateOperation.calculateHours(number));

        OutputConsole.print("Time: " + dateEmulator.getHours() + "." + dateEmulator.getMinutes() +
                "." + dateEmulator.getSeconds());
    }
}
