package day20_string;

import java.util.Scanner;

public class ReplitEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_')+1,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));

        String firstUpper = ("" + firstName.charAt(0)).toUpperCase();
        String secondUpper = ("" + lastName.charAt(0)).toUpperCase();
        String lastUpper = ("" + domain.charAt(0)).toUpperCase();

        System.out.println("First name: " + firstUpper + firstName.substring(1));
        System.out.println("Last name: " + secondUpper + lastName.substring(1));
        System.out.println("Domain: " + lastUpper + domain.substring(1));
    }
}
/*
Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com
Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first
letter of each word is uppercase and the rest are lowercase. Output in the following format:


First name: $first name
Last name: $last name
Domain: $domain
Hint: Think about how to use substring and indexOf together
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    jeff_bezos@amazon.us

  Output:
    First name: Jeff
    Last name: Bezos
    Domain: Amazon
Ex:
  Input:
    sergey_brin@gmail.com
    ​
  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
 */