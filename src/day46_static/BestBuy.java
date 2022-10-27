package day46_static;

public class BestBuy {
    String location; //instance variable

    static String headquarters = "Richfield, Minnesota, US"; //static variable
    static String day = "Wednesday"; //static variable
    static int numberOfComputer = 100; //static variable

    public BestBuy(String location) {
        this.location = location;
    } //constructor

    public void openStore(){
        System.out.println("Opening the " + location);
    }


    public static void reStock() {
        numberOfComputer += 20;
    }


}
