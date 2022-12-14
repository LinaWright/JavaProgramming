package day45_custom_classes;

import day45_custom_classes.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer first = new Offer("Google", "Texas", 200_000, true, 15);//creating an offer object

        ArrayList<Offer> allOffers = new ArrayList<>();//creating an ArrayList that will hold offer objects
        allOffers.add(first);//added the first offer object to the ArrayList
        System.out.println(allOffers);

        allOffers.add(new Offer("Amazon", "New York", 180_000, true, 15));
        System.out.println(allOffers);
        System.out.println();

        Offer[] moreOffers = {
                new Offer("Apple", "Chicago", 230_000, false, 10),
                new Offer("Tesla", "Texas", 250_000, false, 20),
                new Offer("Facebook", "Florida", 120_000, true, 10)
        };// created an array of offer objects
        allOffers.addAll(Arrays.asList(moreOffers));//added the array of Offers into the ArrayList of offers

        allOffers.addAll(Arrays.asList(
             new Offer("Discord","Chicago",150_000,false,13)  ,
             new Offer("Netflix","Canada",170_000,true,12)
        ));//added offer objects using the var args of the asList method to add multiple offer objects at the same time

        System.out.println();
        System.out.println(allOffers);
        //creat arrayLists to filter the Offers
        ArrayList<Offer>salaries = new ArrayList<>(allOffers);
        salaries.removeIf(each->each.salary<170_000);
        System.out.println("Salaries above 170,000");
        System.out.println(salaries);

        System.out.println();
        ArrayList<Offer>fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each -> !each.isFullTime); //each.isFullTime == false

        System.out.println("only full time offers");
        System.out.println(fullTime);
    }
}
