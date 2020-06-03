package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.service.NumberOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskEightMain {
    public static void main(String[] args) {
        NumberOperation numberOperation = new NumberOperation();

        OutputConsole.print("Result: " + numberOperation.calculateResultDependingOnXValue(7.21));
    }
}
