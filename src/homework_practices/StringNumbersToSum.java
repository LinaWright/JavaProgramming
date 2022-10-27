package homework_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    public static void main(String[] args) {
        ArrayList<String>nums=new ArrayList<>(Arrays.asList("123","34","513"));

        for (int i = 0; i < nums.size(); i++) {
            ArrayList<String>each = new ArrayList<>(Arrays.asList(nums.get(i).split("")));

            int sum = 0;
            for (int j = 0; j < each.size(); j++) {
                sum += Integer.parseInt(each.get(j));

            }System.out.println(sum);


        }

    }
}
/*
Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
 */