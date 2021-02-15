package exceptions;

public class BeansAmountException extends Exception {

    private double beans;
    protected String message;

    public BeansAmountException(double beans){
        super(beans + "is not right amount of beans!");
        this.beans = beans;
    }

    protected BeansAmountException(double beans, String message){
        super(beans + message);
        this.message = message;
    }

    public double getBeans(){
        return beans;
    }

}
