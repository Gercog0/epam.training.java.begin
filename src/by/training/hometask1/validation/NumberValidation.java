package by.training.hometask1.validation;

public class NumberValidation {
    public boolean checkForPositiveNumber(int number) {
        return number > 0;
    }

    public boolean checkForPositiveNumber(double number) {
        return number > 0;
    }

    public boolean checkForPositiveNumbersInArray(int... array) {
        for (int i = 0; i < array.length; i++) {
            if (!checkForPositiveNumber(array[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean checkForPositiveNumbersInArray(double... array) {
        for (int i = 0; i < array.length; i++) {
            if (!checkForPositiveNumber(array[i])) {
                return false;
            }
        }
        return true;
    }
}
