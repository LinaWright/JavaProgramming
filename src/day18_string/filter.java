package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class filter {
    public static void main(String[] args) {
        System.out.println("Enter a message");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        message = message.toLowerCase(Locale.ROOT);
        message = message.trim();

        if(message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying")){
            System.out.println("Message failed to send");
        } else {
            System.out.println(message + " was sent");
        }

        /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
     */
    }
}
