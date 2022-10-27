package homework_practices;

import java.util.Scanner;

public class HWConvertStringToChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstName = input.nextLine();
        char [] charOfName = firstName.toCharArray();
        System.out.println("" + charOfName[0] + charOfName[firstName.length()-1]);

    }
}
/*
Ask the user to enter their first name
Convert the name into a char array
print the first and last letter of the name
 */