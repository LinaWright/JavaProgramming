package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping list:\n";
        String addMore;

        do{
            System.out.println("Enter the name of the item");
            list += "\n*" + input.nextLine();
            System.out.println("Do you want to add more to your shopping list?");
        addMore = input.nextLine();
        }while(addMore.equalsIgnoreCase("yes"));
        //if the user types "yes" in the console about wanting to add more items, then the loop will iterate again
       // if the user types anything besides "yes" the equals method will give false anf the loop will stop
        System.out.println(list);
    }
}
/*
repeated steps
ask the user to enter the item
add item to the shopping list
at the end show the full shopping list
ask the user if they want to add more item
 */