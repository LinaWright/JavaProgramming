package day20_string;

import java.util.Scanner;

public class ReplitEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        if(word1.equals(word2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
