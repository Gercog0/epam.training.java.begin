package by.training.hometask1.service;

import by.training.hometask1.entity.PointEmulator;
import by.training.hometask1.exception.UserException;


public class GeometryOperation {
    public double calculateLengthOfCircle(double radius) throws UserException {
        if (!(radius > 0)) {
            throw new UserException("Incorrect data...");
        }
        return 2 * Math.PI * radius;
    }

    public double calculateAreaOfCircle(double radius) throws UserException {
        if (!(radius > 0)) {
            throw new UserException("Incorrect data...");
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public PointEmulator calculateNearestPoint(PointEmulator pointOne, PointEmulator pointTwo) {
        return Math.hypot(pointOne.getX(), pointOne.getY()) >
                Math.hypot(pointTwo.getX(), pointTwo.getY()) ? pointTwo : pointOne;
    }

    public double calculateAreaInscribedSquare(double areaDescribedSquare) throws UserException {
        double radiusCircle = calculateRadiusCircle(areaDescribedSquare);
        return 2 * Math.pow(radiusCircle, 2);
    }

    public double calculateDifferenceSquares(double areaDescribedSquare) throws UserException {
        return calculateAreaInscribedSquare(areaDescribedSquare) / areaDescribedSquare;

    }

    public String calculateSolutionFunctionOnSegment(double a, double b, double h) {
        StringBuilder result = new StringBuilder();
        for (; a <= b; a += h) {
            result.append("x= ").append(a).append("\ttg(x)= ").append(Math.tan(a)).append("\n");
        }
        return result.toString();
    }

    private double calculateLengthSideDescribedSquare(double areaDescribedSquare) throws UserException {
        if (areaDescribedSquare <= 0) {
            throw new UserException("Incorrect data...");
        }
        return Math.sqrt(areaDescribedSquare);
    }

    private double calculateRadiusCircle(double areaDescribedSquare) throws UserException {
        if (areaDescribedSquare <= 0) {
            throw new UserException("Incorrect data...");
        }
        return calculateLengthSideDescribedSquare(areaDescribedSquare) / 2;
    }
}
