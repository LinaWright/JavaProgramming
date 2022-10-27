package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class HomeWorkAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your street address: ");
        String streetAddress = input.nextLine();
        streetAddress = streetAddress.trim();
        streetAddress = streetAddress.toUpperCase(Locale.ROOT);
        System.out.println(streetAddress);
        if (streetAddress.startsWith("500")) {
            System.out.println("The house is on the right side of the street");
        } else if (streetAddress.startsWith("600")) {
            System.out.println("The house is on the left side of the street");
        }
        if (streetAddress.contains("DRIVE")) {
            System.out.println("house on drive");
        } else if (streetAddress.contains("LANE")) {
            System.out.println("house on lane");
        } else if (streetAddress.contains("AVE")) {
            System.out.println("house on avenue");
        }

    }
}
    /*
    create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters
houses that have a house number starting with the numbers 500 are on
the right side of the street while the address that start with the number
600 are on the left side of the street.
the street they are on is given in the address
print the street by checking for these streets:
drive: house on drive
lane: house on lane
ave: house on avenue
Ex:
Input:
500312 road w drive, 98404
Output:
500312 ROAD W DRIVE, 98404
house on the right side
house on drive
Ex:
Input:
600134 South lane, 500415
Output:
600134 SOUTH LANE, 500415
house on the right side
house on drive
*/

