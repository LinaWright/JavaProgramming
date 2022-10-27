package Interview_questions;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("reverseString(\"java\") = " + reverseString2("java"));
    }


    public static String reverseString1(String str) {
        String reveredString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reveredString += str.charAt(i);
        }
        return reveredString;
    }

    public static String reverseString2(String str){
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String reversed = "";
        Collections.reverse(list);
        reversed = list.toString().replace("[","").replace("]","").replace(", ","");

        return reversed;
    }

    public static String reverseString3(String str){
        String revered = "";
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(str.split("")));

        //pop() -> deletes the last element and returns it;
        for (int i = 0; i < str.length(); i++) {
            revered += stack.pop();
        }

        return revered;
    }
}



/*
String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.
 */