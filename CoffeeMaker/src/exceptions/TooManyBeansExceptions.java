package exceptions;

import exceptions.BeansAmountException;

public class TooManyBeansExceptions extends BeansAmountException {

    public TooManyBeansExceptions(double beans) {
        super(beans, " is too many beans");
    }
}

