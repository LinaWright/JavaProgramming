package day23_loops;

import java.util.Scanner;

public class HomeWorkSyllables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a word separated by dashes: ");
        String sentence = input.nextLine();
        int dashes = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)=='-'){
                dashes++;
            }
        }
        System.out.println(dashes+1);
    }
}
/*Saim's code
  String s = "ja-va-script"; //input.nextLine()
        int syllables = 1;

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '-'){
                syllables++;
            }

        }

        System.out.println("Syllables: " + syllables);
Given a String separated by dashes calculate how many syllables the
words are
Ex:
Input:
ja-va
Output:
2
 */