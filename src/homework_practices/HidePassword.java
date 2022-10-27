package homework_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        ArrayList<String>password = new ArrayList<>(Arrays.asList("One","Hi","Hold"));
        ArrayList<String>hiddenPassword = new ArrayList<>();
        for (String each : password) {
           String word = "";
            for (int j = 0; j < each.length(); j++) {//3 2 4
                word += each.replaceAll(each, "*");
            }
            hiddenPassword.add(word);
        }
        System.out.println(hiddenPassword);
    }



}
    /*
    Given an ArrayList of passwords (String). Hide each password in a star
    (*) format where each character is a star and print the ArrayList of
    hidden passwords
    Ex:
    Input:
    {"one", "hi", "hold}
    Output:
    [ ***, **, **** ]
     */