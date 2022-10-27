package day19_string;

import java.util.Scanner;

public class HomeworkMoveFirstWord {
    /*
    [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
Input: Java is a fun language
Output: is a fun language Java
Hint: Use indexOf and substring

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        int empty = sentence.indexOf(" ");
        String word1 = sentence.substring(0,empty);
        sentence = sentence.substring(empty + 1);
        sentence = sentence + " " +word1;
        System.out.println(sentence);
    }

     */
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();   // I made a mistake using String sentence = input.next() This reads input only until next space...
        int firstSpace = sentence.indexOf(" "); //This is to find the index of the first space of the sentence in order to separate the first word
        String word1 = sentence.substring(0, firstSpace);
        sentence = sentence.substring(firstSpace + 1); //This is to take out the part of the sentence from second word until the end
        //sentence = sentence.substring(firstSpace).trim();
        sentence = sentence + " " + word1;
        System.out.println(sentence);
    }
}
