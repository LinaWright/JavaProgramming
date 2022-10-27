package homework_practices;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if (!(password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*"))) {
            System.out.println("Must have one of the follow special characters: ! @ # $ % ^ & *");
        }
        if (password.length() < 8) {
            System.out.println("Must have at least 8 characters");
        }
        int upper = 0;
        int lower = 0;
        int num = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upper++;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lower++;
            }
            if (Character.isDigit(password.charAt(i))) {
                num++;
            }
        }
        if (upper == 0) {
            System.out.println("Must have at least 1 uppercase letter");
        }
        if (lower == 0) {
            System.out.println("Must have at least 1 lowercase letter");
        }
        if (num == 0) {
            System.out.println("Must have at least 1 number");
        }
    }
}
/*
Valid Password

	Given a String password find out if it is a valid password

	Requirements:

		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *
 */