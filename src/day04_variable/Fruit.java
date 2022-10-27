package day04_variable;

public class Fruit {
    public static void main(String[] args) {
        int apples=50;
        int grapes=100;
        int banana=150;

        System.out.println("This is how many apples we have: " + apples);
        System.out.println("This is how many grapes we have: " + grapes);
        System.out.println("This is how many bananas we have: " + banana);
        System.out.println("sold some apples");
apples = 25; //reassigned

        int price = 20;
        System.out.println("Apples after selling: " + apples);
        //System.out.println("This price of my 25 apples is $20"); hard coded
        System.out.println("This price of my " + apples + " apples is $" + price);
    }
}
