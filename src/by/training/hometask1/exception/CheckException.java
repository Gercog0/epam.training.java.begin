package by.training.hometask1.exception;

public class CheckException {
    public static void checkForException(boolean value) {
        try {
            if (!value) {
                throw new UserException("Incorrect data. Error");
            }
        } catch (UserException ex) {
            System.err.print(ex.getMessage());
            System.exit(0);
        }
    }
}
