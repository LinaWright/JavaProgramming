package day22_loops;

import java.util.Locale;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keepTalking = true;
        while (keepTalking) {
            System.out.println("Enter a message");
            String msg = input.nextLine().toLowerCase(Locale.ROOT);

            switch (msg) {
                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you":
                    System.out.println("I'm good");
                    break;
                case "i love you":
                    System.out.println("I love you too!");
                    break;
                case "bye":
                    System.out.println("No, don't leave");
                    keepTalking = false;
                    break;
                default:
                    System.out.println("I don't know what you said");

            }

        }
    }
}
