package homework_practices;

import java.util.ArrayList;

public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("java");
        list.add("html");
        list.add("css");
        list.add("java");
        list.add("javascript");
        list.add("selenium");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("java")){
                count++;
            }
        }System.out.println(count);
    }
}
    /*
    Given an ArrayList of Strings and a target word (String) print how many
    times the target word is in the ArrayList
    Ex:
    Input:
    ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
    Target: java
    Output:
    2
     */