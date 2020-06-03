package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.NumberOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskFiveMain {
    public static void main(String[] args) {
        NumberOperation numberOperation = new NumberOperation();
        NumberValidation numberValidation = new NumberValidation();

        int number = 28;

        CheckException.checkForException(numberValidation.checkForPositiveNumber(number));

        OutputConsole.print("Is number is perfect? " +
                numberOperation.isNumberPerfect(number));
    }
}
