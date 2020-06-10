package by.training.hometask1.validator;

public class NumberValidator {
    public boolean checkForPositiveNumbersInArray(int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkForPositiveNumbersInArray(double... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method is designed to prevent division by zero in the denominator.
     * This case is possible in the NumberOperation class,
     * in the calculateEquationTwo method.
     */
    public boolean checkCubeIsSix(double number){
        return Math.cbrt(6) != number;
    }
}
