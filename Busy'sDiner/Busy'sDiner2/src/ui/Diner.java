package ui;

import model.Chef;
import model.Server;
import model.Order;
import model.Dish;

import java.util.ArrayList;
import java.util.List;

public class Diner {

    private static Dish dish = generateTurkeyClubSandwich();

    public static void main(String[] args) {
        Server server = new Server(dish);
        Chef chef = new Chef();

        for (int i=0; i < 2 ; i++) {
            System.out.println("Table " + (i + 1) + ":\n");

            server.greet();
            server.describeDish();
            Order o = server.takeOrder();

            System.out.println();
            chef.makeDish(o);

            doOrderRoutine(server, o);
            System.out.println();
        }

        System.out.println();
        chef.doDishes();
    }

    private static void doOrderRoutine(Server s, Order o) {
        System.out.println();
        if (o.isReadyToBeServed())
            s.deliverFood(o);
        if(o.isReadyToBePaid())
            s.takePayment(o);
    }

    private static Dish generateTurkeyClubSandwich() {
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("avocado");
        ingredients.add("sriracha");
        ingredients.add("cheddar cheese");
        ingredients.add("bread");
        ingredients.add("lettuce");
        ingredients.add("tomato");
        ingredients.add("turkey");
        ingredients.add("bacon");
        return new Dish("Turkey club sandwich",
                "\t1. Pour sriracha\n\t2. Spread avocado\n\t3. Stack meat\n\t4. Place veggies",
                ingredients,
                 "\"Our trendy sandwich has avocado, sriracha sauce, cheese, veggies, turkey and bacon.\"");
    }

}