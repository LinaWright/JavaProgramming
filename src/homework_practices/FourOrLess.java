package homework_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("apples","tree","loop","cat", "animal","shortcut"));

        ArrayList<String>newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()<=4){
               newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }
}
    /*
    Given an ArrayList of Strings, go through and find Strings that are 4
    characters or less. Take those Strings and put them into a different
    ArrayList. Print that ArrayList of words
    Ex:
    Input:
    “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
    Output:
    [ tree, loop, cat ]
     */