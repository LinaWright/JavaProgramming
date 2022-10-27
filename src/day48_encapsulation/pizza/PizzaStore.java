package day48_encapsulation.pizza;

import day48_encapsulation.pizza.Pizza;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza first = new Pizza("large", 3);
        System.out.println(first);
        // first.numberOfToppings = 2;
        first.setTopping(2);
        System.out.println(first);

        Pizza second = new Pizza("", -2);
        // second.numberOfToppings = -2;
        System.out.println(second);

        second.setSize("Small");
        second.setTopping(1);
        System.out.println(second);


    }
}
