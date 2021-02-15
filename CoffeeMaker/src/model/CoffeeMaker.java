package model;

import exceptions.*;


/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {

    public CoffeeMaker(){
        // TODO: complete the implementation of this method
    }

    // getters
    public int getTimeSinceLastBrew() {
        // TODO: complete the implementation of this method
        return 0;
    }

    //EFFECTS: returns how many cups remaining in pot (a full pot is 20 cups)
    public int getCupsRemaining() {
        // TODO: complete the implementation of this method
        return 0;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() throws NoCupsRemainingException {
        // TODO: complete the implementation of this method
        return false;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time) {
        // TODO: complete the implementation of this method
    }

            //Requires clause LL no longer needed, managed by exception:
            // REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups
    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    //         throws BeansAmountException if beans are not between 2.4 and 2.6 cups,
    //         throws WaterException if water <= 14.75
    public void brew(double beans, double water) throws BeansAmountException, WaterException {
        // TODO: complete the implementation of this method
        getCupsRemaining();
        setTimeSinceLastBrew(0);

    }

            //Requires clause LL no longer needed, managed by exception:
            //REQUIRES: cups remaining > 0, time since last brew < 60
    //MODIFIES: this
    //EFFECTS: subtracts one cup from cups remaining
    //         throws NoCupsRemainingException if cups remaining <= 0
    //         throws StaleCoffeeException if time since last brew >= 60
    public void pourCoffee() throws NoCupsRemainingException, StaleCoffeeException {
        // TODO: complete the implementation of this method
        areCupsRemaining();
        getTimeSinceLastBrew();
    }


}
