package day41_arraylist;

import day40_arraylist.ArrayListWithMethods;
import my_utilties.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static ArrayList<String> reverseAll(ArrayList<String> list) {
        ArrayList<String> reverseWords = new ArrayList<>();
        for (String each : list) {
            reverseWords.add(StringUtil.reverse(each)); //We call the reverse method in StringUtil class to reverse each word, each element, then we are adding the reversed word into the 'reverseWords' ArrayList;
        }
        return reverseWords;
    }

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(list));
        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));
    }
}
    /*
    Reverse All
    Create a method that will take an ArrayList of Strings and
    reverse each element and return an ArrayList of
    all reversed words
    @param words - Given ArrayList of Strings
    @return - ArrayList of Strings
    Ex:
    Input: {"ted", "talk", "learn"}
    Output: {"det", "klat", "nrael"}
     */