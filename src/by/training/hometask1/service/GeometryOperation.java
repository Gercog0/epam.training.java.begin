package by.training.hometask1.service;

import by.training.hometask1.entity.PointEmulator;

public class GeometryOperation {
    public double getLengthOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public PointEmulator getNearestPoint(PointEmulator pointOne, PointEmulator pointTwo) {
        return Math.hypot(pointOne.getX(), pointOne.getY()) >
                Math.hypot(pointTwo.getX(), pointTwo.getY()) ? pointTwo : pointOne;
    }

    public double getAreaInscribedSquare(double areaDescribedSquare) {
        double radiusCircle = getRadiusCircle(areaDescribedSquare);
        return 2 * Math.pow(radiusCircle, 2);
    }

    public double getDifferenceSquares(double areaDescribedSquare) {
        return getAreaInscribedSquare(areaDescribedSquare) / areaDescribedSquare;

    }

    public String getSolutionFunctionOnSegment(double a, double b, double h) {
        String result = "";
        for (; a <= b; a += h) {
            result += "x=" + a + "\ttg(x)= " + Math.tan(a) + "\n";
        }
        return result;
    }

    private double getLengthSideDescribedSquare(double areaDescribedSquare) {
        return Math.sqrt(areaDescribedSquare);
    }

    private double getRadiusCircle(double areaDescribedSquare) {
        return getLengthSideDescribedSquare(areaDescribedSquare) / 2;
    }


}
