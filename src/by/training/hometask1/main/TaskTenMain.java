package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.GeometryOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskTenMain {
    public static void main(String[] args) {
        NumberValidation numberValidation = new NumberValidation();
        GeometryOperation geometryOperation = new GeometryOperation();

        double x1 = 1;
        double x2 = 5;
        double step = 0.5;

        CheckException.checkForException(numberValidation.checkForPositiveNumber(step));
        OutputConsole.print("Table:\n" + geometryOperation.getSolutionFunctionOnSegment(x1, x2, step));

    }
}
