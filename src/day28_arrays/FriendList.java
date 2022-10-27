package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have");
        int howMany = input.nextInt();

        String [] friends = new String[howMany];
        for (int i = 0; i < howMany; i++) {
            System.out.println("Enter friends name");
            friends[i] = input.next();
        }

        System.out.println(Arrays.toString(friends));

    }
}

 /*

        Make an array of your friends names

        asking how many friends do you have

        then ask for each friend's name one at a time, store all the names into an array

        at the end print your friend list
     */