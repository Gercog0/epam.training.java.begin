package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.GeometryOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskNineMain {
    public static void main(String[] args) {
        NumberValidation numberValidation = new NumberValidation();
        GeometryOperation geometryOperation =  new GeometryOperation();

        double radius = 21.21;
        CheckException.checkForException(numberValidation.checkForPositiveNumber(radius));

        OutputConsole.print("Length of circle: " + geometryOperation.getLengthOfCircle(radius));
        OutputConsole.print("Area of circle: " + geometryOperation.getAreaOfCircle(radius));
    }
}
