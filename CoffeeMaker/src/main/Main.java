package main;

import exceptions.BeansAmountException;
import exceptions.NoCupsRemainingException;
import exceptions.StaleCoffeeException;
import exceptions.WaterException;
import model.CoffeeMaker;

public class Main {


    public static void main(String[] args){
        // TODO: complete the implementation of Main

        CoffeeMaker cm = new CoffeeMaker();
        try {
            cm.brew(2,2);
        } catch (BeansAmountException e) {
            System.out.println("Take a look on correct amount of beans.");
        } catch (WaterException e) {
            System.out.println("Fill water.");
        }

        try{
            cm.pourCoffee();
        } catch (NoCupsRemainingException e) {
            System.out.println("Add cups.");
        } catch (StaleCoffeeException e){
            System.out.println("Too much time since last brew, brew again.");
        }

    }


}