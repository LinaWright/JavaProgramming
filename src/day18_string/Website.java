package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        /*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a website:");
        String website = input.next();
        website = website.toLowerCase(Locale.ROOT);

        boolean validstart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".net") || website.endsWith(".gov");
        if (validstart && validEnd) {
            System.out.println("Valid website");
        } else {
            if (!validstart) {
                System.out.println("Website needs to start with www.");
            }
            if (!validEnd) {
                System.out.println("Website needs to end with .com or .edu or .net or .gov");
            }
        }
    }
}

