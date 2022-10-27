package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an URL");
        String URL = input.next();
        System.out.println(URL.substring(4,URL.length()-4));
    }
    /*

    Task

        ask the user to enter an url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */
}
