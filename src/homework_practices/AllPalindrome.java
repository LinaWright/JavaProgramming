package homework_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    public static ArrayList<String> palindrom(ArrayList<String> input) {
        ArrayList<String> palindromList = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            String reverse = "";
            for (int j = input.get(i).length()-1; j >= 0 ; j--) {
                reverse += input.get(i).charAt(j); // characters are being read from the end and being added backwards a reverse String
            }
            if(input.get(i).equalsIgnoreCase(reverse)){
                palindromList.add(input.get(i));
            }
        }
        return palindromList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(palindrom(list));
    }
}
    /*
    All Palindrome
    Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
    Ignore case sensitivity
    Ex:
    Input:
    "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
    Output:
    Anna, Racecar, Level, Eye
     */