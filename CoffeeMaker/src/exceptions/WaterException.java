package exceptions;

public class WaterException extends Exception {

    private double water;

    public WaterException(double water){
        super("Not enough water!");
    }

}
