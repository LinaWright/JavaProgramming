package day42_customer_classes;

public class Coffee {
    /*
    Creat a coffee class with these instance variables:
    brand, price size(oz) brand types
    ex type: black cappuccino, latte, mochiato
    instance methods:
    make a toString to print all the information of the coffee objects
    drink: print trying type of coffee
    refill(amount in oz): print refilling xoz
    add the number of oz to the total size
     */
    double price;
    double size;
    String brand;
    String type;

    public void drink(){
        System.out.println("Drinking " + type);
        size -=  1.5;
    }
    public void refill(double amount){
        System.out.println("refilling " + size + " ozs");
        size += amount;
    }
    @Override
    public String toString() {
        return type + " from " + brand + " size of " + size + " oz. for a total price of " + price;
    }


}
