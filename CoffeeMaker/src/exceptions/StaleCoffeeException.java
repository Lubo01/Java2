package exceptions;

public class StaleCoffeeException extends Exception {

    private int timeSinceLastBrew;

    public StaleCoffeeException(int timeSinceLastBrew){
        super("Too much time since last brew!");
    }
}
