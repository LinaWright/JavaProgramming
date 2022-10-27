package day15_switch;

import java.util.Scanner;

public class Homework5Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are staying in the room");
        int numberOfPeople = input.nextInt();
        switch (numberOfPeople) {
            case 1:
                System.out.println("room type: single room\n" +
                        "price: number of days * 100");
                break;
            case 2:
                System.out.println("room type: double room\n" +
                        "price: number of days * 125");
                break;
            case 3:
            case 4:
                System.out.println("room type: large room\n" +
                        "price: number of days * number of people * 150");
            case 5:
            case 6:
            case 7:
                System.out.println("room type: suite\n" +
                        "price: number of days * 5000");
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for \n" +
                        "that size party");

        }
    }
}
   /*
   Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are
staying in the room)
Use those two information to determine the price and room type for the
hotel based on the below data:
party size: 1
room type: single room
price: number of days * 100
party size: 2
room type: double room
price: number of days * 125
party size: 3 or 4
room type: large room
price: number of days * number of people * 150
party size: 5, 6, or 7
room type: suite
price: number of days * 5000
any other party size:
Display one message:
Sorry we don't have any available rooms for
that size party
    */