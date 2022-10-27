package replits;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] split = sentence.split(" ");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

    }
}
    /*
    Given a String sentence use the split() method to divide each word from the sentence and print them in separate lines
    Hint: Think about what comes between each word in the sentence

    Main topics: arrays, String

    Example:

    Input:
      Java is fun

    Output:
      Java
      is
      fun
     */