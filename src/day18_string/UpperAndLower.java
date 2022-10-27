package day18_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {
        String str = "sNOw";
        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase(Locale.ROOT);
        System.out.println(word);

        String word2 = word + "WORLD";

        System.out.println(word);
        System.out.println(word2); //String type is immutable

        int a = 4;
        a++;
        System.out.println(a); //primitive type is not immutable

        word += "new text"; //word = word + "next text";

        String old = "mark";
        String newValue = old.toUpperCase();


    }
}
