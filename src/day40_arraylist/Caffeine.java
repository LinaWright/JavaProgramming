package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("energy drinks");
        System.out.println(drinks);

        ArrayList<String>drinks2 = new ArrayList<>(drinks); //ArrayList type --> collection type
        System.out.println(drinks);

        String[]allDrinks={"coffee", "tea", "soda", "energy drinks"};
        //ArrayList<String> drinks3 = new ArrayList<>(allDrinks); This one is not valid, because the array is not a valid argument;

        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks)); //Array type --> need to use method Arrays.asList()
        System.out.println(drinks3);

        ArrayList<String>drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "soda", "energy drinks"));

        ArrayList<String>drinks5 = new ArrayList<>();
        drinks5.addAll(Arrays.asList("coffee", "tea", "soda", "energy drinks"));
        System.out.println(drinks5);
    }
}
/*
  ArrayList<type> name = new ArrayList<>( collection type );

            -> it will create an ArrayList with the values from the given collection type

            --> collection type: so far we only know ArrayList

                ArrayList<type> name = new ArrayList<>( ArrayList );

        Q: Are array objects a collection type

            No, they are not in the collection framework, but we can use the Arrays utility class to help us convert an array into a collection type

                INVALID --> ArrayList<type> name = new ArrayList<>( array [] );
                VALID     --> ArrayList<type> name = new ArrayList<>( Arrays.asList( array []) );

        Arrays.asList()
            parameters: array objects (var arg)
            return: collection type

            Note: this method is a var arg method, so we are able to type elements in the parenthesis and those will be taken as the array elements
 */