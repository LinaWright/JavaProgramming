package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        Ask the user to enter the first
        Ask the user to ender the last name
        Print the initials
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toUpperCase(Locale.ROOT);
        System.out.println("Enter your last name");
        String lastName = input.next().toUpperCase(Locale.ROOT);

        System.out.println("Your initial is " + firstName.charAt(0) + lastName.charAt(0));

        /*
            1)
            firstName = firstName.toUpperCase();
            char firstLetter = firstName.charAt(0);

            2)
            char firstLetter = firstName.toUpperCase().charAt(0);


         */
    }
}
