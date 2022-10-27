package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class HomeworkCreatingEmail {
    /*
    [Creating an email]
Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter
than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “@cybertek.com” and print the final string as your created email. The final email
should be in all lowercase.
input: JamesBond Secret
output: jameret@cybertek.com
     */
    public static void main(String[] args) {
        System.out.println("Enter two strings. Both strings should be at least 6 character long.");
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        if(str1.length()<6||str2.length()<6){
            System.out.println("Invalid data");
        }else{
            String first4Char = str1.substring(0,4);
            String last3Char = str2.substring(str2.length()-3, str2.length());
            String Email = first4Char + last3Char + "@cybertek.com";
            System.out.println("Your email is: " + Email.toLowerCase(Locale.ROOT));
        }
    }
}
