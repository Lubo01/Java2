package test;

import model.CoffeeMaker;
import exceptions.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;


public class CoffeeMakerTest {

    private CoffeeMaker cmTest;

    @Before
    public void setUp(){
        // TODO: instantiate your test objects here
        cmTest = new CoffeeMaker();

    }

    @Test
    public void testTemplate(){
        // TODO: write some more tests
        // This is a template for unit tests
    }

    @Test
    public void brewTest(){
        // TODO: write some more tests
        try{
            cmTest.brew(2.5,15);
            cmTest.brew(2.4,14.5);
            cmTest.brew(2.6,14.5);
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    public void pourCoffeeTest(){
        // TODO: write some more tests
        try{
            cmTest.pourCoffee();
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
