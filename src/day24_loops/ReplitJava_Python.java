package day24_loops;

import java.util.Locale;
import java.util.Scanner;

public class ReplitJava_Python {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
sentence = sentence.toLowerCase(Locale.ROOT);
        int countJava = 0;
        int countPython = 0;
        for (int i = 0; i < sentence.length()-5; i++) {
            if(("" + sentence.charAt(i)).equals("j")&&("" + sentence.charAt(i+1)).equals("a")&&("" + sentence.charAt(i+2)).equals("v")&&
                    ("" + sentence.charAt(i+3)).equals("a")){
                countJava++;
            }
            if(("" + sentence.charAt(i)).equals("p")&&("" + sentence.charAt(i+1)).equals("y")&&("" + sentence.charAt(i+2)).equals("t")&&
                    ("" + sentence.charAt(i+3)).equals("h")&&("" + sentence.charAt(i+4)).equals("o")&&("" + sentence.charAt(i+5)).equals("n")){
                countPython++;
            }
        }
        if(countJava==countPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
/*
Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15]
and specifically designed to have as few implementation dependencies as possible.
 */
/*
Use a loop to count how many times the characters java and python are found in the given String sentence. Output true if java and python appear
the same number of times, otherwise output false.
Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements


Ex:
  Input:
    We study java not python

  Output:
    true

Ex:
  Input:
    What's the difference between java, javascript and python?

  Output:
    false

  -> the 'java' characters appear 2 times in the String but the 'python' characters appear only 1 time.
Ex:
  Input:
   Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and specifically
   designed to have as few implementation dependencies as possible.
  ​
  Output:
    true
    ​
  -> The first word 'Java' is not counted because it starts with the uppercase 'J', so the number of times 'java' and 'python'
  appear in this String is 0 and 0 and since they are the same, the output is true
 */