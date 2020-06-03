package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.NumberOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskFourMain {
    public static void main(String[] args) {
        NumberValidation numberValidation = new NumberValidation();
        NumberOperation numberOperation = new NumberOperation();

        int number1 = 12;
        int number2 = 1;
        int number3 = 3;
        int number4 = 7;

        CheckException.checkForException(
                numberValidation.checkForPositiveNumbersInArray(number1, number2, number3, number4));

        OutputConsole.print("Two numbers are even? " +
                numberOperation.isTwoNumberEven(number1, number2, number3, number4));
    }
}
