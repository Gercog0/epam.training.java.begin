package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.NumberOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskOneMain {
    public static void main(String[] args) {
        NumberValidation numberValidation = new NumberValidation();
        NumberOperation numberOperation = new NumberOperation();

        int number = 21888;

        CheckException.checkForException(numberValidation.checkForPositiveNumber(number));

        OutputConsole.print("The last digit of the number square: " +
                numberOperation.getLastDigitOfNumberSquare(number));
    }
}
