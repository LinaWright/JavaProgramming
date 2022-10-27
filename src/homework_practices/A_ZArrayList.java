package homework_practices;

import java.util.ArrayList;

public class A_ZArrayList {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            letters.add(i);
        }
        System.out.println(letters);
        letters.remove(letters.indexOf('a'));
        letters.remove(letters.indexOf('e'));
        letters.remove(letters.indexOf('i'));
        letters.remove(letters.indexOf('o'));
        letters.remove(letters.indexOf('u'));
        System.out.println(letters);

    }
}
/*
Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList
 */