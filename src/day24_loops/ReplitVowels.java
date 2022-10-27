package day24_loops;

import java.util.Locale;
import java.util.Scanner;

public class ReplitVowels {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String word = input.nextLine().toLowerCase(Locale.ROOT);
            String vowel = "";
            for (int i = 0; i < word.length(); i++) {
                if((""+word.charAt(i)).equals("a")||(""+word.charAt(i)).equals("e")||(""+word.charAt(i)).equals("i")
                        ||(""+word.charAt(i)).equals("o")||(""+word.charAt(i)).equals("u")){
                    vowel+=word.charAt(i);
                }
            }
            System.out.println(vowel);

        }
}
/*
Use a loop to print each vowel( a, e, i, o, u) from the given word
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    howdyho

  Output:
    oo

Ex:
  Input:
    java

  Output:
    aa
Ex:
  Input:
    apple
    ​
  Output:
    ae
 */