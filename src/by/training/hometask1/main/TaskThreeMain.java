package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.exception.CheckException;
import by.training.hometask1.service.GeometryOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskThreeMain {
    public static void main(String[] args) {
        NumberValidation numberValidation = new NumberValidation();
        GeometryOperation geometryOperation =  new GeometryOperation();

        double areaSquare = 21.21;

        CheckException.checkForException(numberValidation.checkForPositiveNumber(areaSquare));

        OutputConsole.print("The area of a square inscribed in a circle: " +
                geometryOperation.getAreaInscribedSquare(areaSquare));
        OutputConsole.print("The difference between the squares: " +
                geometryOperation.getDifferenceSquares(areaSquare));
    }
}
