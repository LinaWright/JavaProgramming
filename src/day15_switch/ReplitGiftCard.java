package day15_switch;

import java.util.Scanner;

public class ReplitGiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item = input.nextLine();
        int price = 0;
        switch (item){
            case "Blanket":
                price = 60;
                break;
            case "Charger":
                price = 5;
                break;
            case "Hat":
                price = 25;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Laptop":
                price = 200;
                break;
            case "Pants":
                price = 50;
                break;
            case "Pillow":
                price = 40;
                break;
            case "Smartphone":
                price = 1000;
                break;
            case "Socks":
                price = 5;
                break;
            case "USB cable":
                price = 10;
                break;
            default:
                System.out.println("Sorry, that is an invalid item");
        }
        if(price<100) {
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: " + (100 - price) + "$");
        }else{
            System.out.println("Sorry, not enough funds on your gift card");
        }
    }
}
  /*You got a $100 gift card for your birthday, but we can't use it yet. We need to build the application for the store in order to use our gift card.
The program will ask the user to enter the item they want to buy. Then it will check if that item is in the store inventory. If the item is available
 there will be a confirmation message displayed and the remaining balance on the gift card will be output as well. In some cases that item may not be
 available in the store and in other cases we may not have enough money on the gift card to buy an item so we must handle both of these conditions as
 well. We can only make one purchase at a time.
List of items, with prices, available in the store:

Blanket: $60
Charger: $5
Hat: $25
Headphones: $30
Laptop: $200
Pants: $50
Pillow: $40
Smartphone: $1000
Socks: $5
USB cable: $10
If the item is not in the list, display message: Sorry, that is an invalid item
If the price of the item we want is more than $100, display message: Sorry, not enough funds on your gift card
Hint: Use a switch statement to avoid having to compare String values in if statements. Don't forget to create your Scanner object.
Main topics: switch statements, primitive variables, operators, Scanner

   */