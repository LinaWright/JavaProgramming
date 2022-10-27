package homework_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String>input = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        ArrayList<String>output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            ArrayList<String>each = new ArrayList<>(Arrays.asList(input.get(i).split("")));
            Collections.reverse(each);

            System.out.println(each);
        }

    }
}
    /*
    Create a method that will take an ArrayList of Strings and
    reverse each element and return an ArrayList of
    all reversed words
    @param words - Given ArrayList of Strings
    @return - ArrayList of Strings
    Ex:
    Input: {"ted", "talk", "learn"}
    Output: {"det", "klat", "nrael"}
     */