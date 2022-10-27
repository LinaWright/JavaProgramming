package replits;

import java.util.Scanner;

public class replitFirstLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        char firstChar = ' ';
        char lastChar = ' ';
        for (int i = 0; i < words.length; i++) {
            firstChar = words[i].charAt(0);
            lastChar = words[i].charAt(words[i].length()-1);
            System.out.println(""+firstChar+lastChar);
        }

    }
}
    /*
    Given a String [] words print the first and last character of each String element in the array. Print the first and last character in the same line with no spaces.
    Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.
    Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, String

    Example:

    Input:
      ["hello", "why", "by", "apple" , "note"]

    Output:
      ho
      wy
      by
      ae
      ne
     */