package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FixingName {
    public static void main(String[] args) {
        /*
        first name
        last name

        fix to print proper name
        capital first letter, the rest of the letter lowercase, no extra space
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next(); //   jaMES

        System.out.println("Enter your last name");
        String lastName = input.next();

        firstName = firstName.trim().toLowerCase(Locale.ROOT); //james
        lastName = lastName.trim().toLowerCase(Locale.ROOT);

        String fixedFirst = firstName.substring(0,1).toUpperCase(Locale.ROOT); //J /firstName,charAt(0)-->this will also give you the first character,
        // but as a char type
        fixedFirst += firstName.substring(1); //James

        String fixedLast = lastName.substring(0,1).toUpperCase(Locale.ROOT) + lastName.substring(1);

        System.out.println(fixedFirst+" "+fixedLast);

    }
}
