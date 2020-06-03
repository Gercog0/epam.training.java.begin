package by.training.hometask1.main;

import by.training.hometask1.console.OutputConsole;
import by.training.hometask1.entity.PointEmulator;
import by.training.hometask1.service.GeometryOperation;
import by.training.hometask1.validation.NumberValidation;

public class TaskSevenMain {
    public static void main(String[] args) {
        GeometryOperation geometryOperation = new GeometryOperation();
        PointEmulator point1 = new PointEmulator(-5,2);
        PointEmulator point2 = new PointEmulator(11,-3);

        OutputConsole.print("Nearest point is: " +
                geometryOperation.getNearestPoint(point1, point2));
    }
}
