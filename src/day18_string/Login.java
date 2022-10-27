package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    /*
    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid password: "jamesbond"
    ->if the entered password is matches the system password
    logged in

    otherwise print
    invalid password
     */
    public static void main(String[] args) {
        System.out.println("Enter a username, make sure the username is in lowercase");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        userName = userName.toLowerCase(Locale.ROOT);
        System.out.println(userName);

        System.out.println("Enter the password: ");

        String password = input.next();
        if(password.length()>=8 && password.equals("jamesbond")){
            System.out.println("Logged in with " + userName);
        } else {
            System.out.println("invalid password");
        }

    }
}
