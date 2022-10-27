package homework_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
public static int frequency(ArrayList<String>str,char letter){
    int count=0;
    for (int i = 0; i < str.size(); i++) {
        for (int j = 0; j < str.get(i).length(); j++) {
            if(str.get(i).charAt(j)=='a'){
                count++;
            }
        }
    }
    return count;
}

    public static void main(String[] args) {
    ArrayList<String> input = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        System.out.println(frequency(input,'a'));
    }
}
    /*
    Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
    Ex:
    Input:
    ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
    letter: ‘a’
    Output:
    6
     */