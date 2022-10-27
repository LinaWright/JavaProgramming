package day20_string;

import java.util.Scanner;

public class ReplitContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        if(sentence.contains(word)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
