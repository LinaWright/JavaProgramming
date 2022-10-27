package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {
        int numbersOfItems = 0;
        double price = 0.0;
        System.out.println("We pick up 1 water");
        System.out.println("How many items in the cart: " + ++numbersOfItems); //1
        //preincrement, so the numbers of items increases right away, then it is printed
        price = price + 2.5; // take the price value, which 0, and add 2.5, and they reassign to the price variable

        System.out.println("We pick up 2eggs");
        System.out.println("How many items in the cart: " + ++numbersOfItems); //2
        System.out.println("How many items in the cart: " + ++numbersOfItems); //3

        System.out.println(numbersOfItems++); //3
        System.out.println(numbersOfItems); //4


    }
}
