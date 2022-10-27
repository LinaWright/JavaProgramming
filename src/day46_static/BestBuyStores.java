package day46_static;

public class BestBuyStores {
    public static void main(String[] args) {
        //access the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputer);

        BestBuy store1 = new BestBuy("Oak Drive");
        System.out.println(store1.location);//accessing the instance variable
        System.out.println(store1.numberOfComputer);

        store1.numberOfComputer--; //99
        System.out.println(BestBuy.numberOfComputer);

        BestBuy store2 = new BestBuy("Main St");

        store2.numberOfComputer -= 5;
        System.out.println(store2.numberOfComputer);//94 there is only one single copy of the object
        System.out.println(BestBuy.numberOfComputer);//94 there is only one single copy of the object

        store2.location = "Fairfax";
        //instance variable only belong to one object, so it only effects store2 object

        BestBuy.reStock();

        //BestBuy.openStore() incorrect
        store1.openStore();
        store2.openStore();
    }
}
