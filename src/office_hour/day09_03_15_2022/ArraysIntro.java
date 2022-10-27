package office_hour.day09_03_15_2022;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        /*
        What is array?
        An array is data structure that can hold multiple values
        ordered data structure (has index numbers)
        size is fixed (Disadvantage)
        int[] num = new int[5]//in order to change you have to reassign
        num = new int[6];


        default Vaules
        String-->null
        byte/shot/int/long -->0
        float/double-->0.0
        boolean-->false

         */

        //declaring arrays
        //1
        String[] color = {"yellow", "blue", "pink"};
        // color[3]="purple"; -->we can not add element to Array
        //2
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;

        //How can we retrieve data from Array
        System.out.println(color[0]);//yellow
        //how can we reassign data from Array
        color[0]="red";
        System.out.println(color[0]);//red

        /*
        array Utility
            Array class is presented "java.util"
            - toString() --> System.out.println(Arrays.toString(color));


         */
        System.out.println(Arrays.toString(color));
        System.out.println(Arrays.toString(color).replace("[","").replace("]",""));//remove the square brackets

        //Length
        System.out.println(color.length);
        //What is the  difference between length() VVS length/
        //length-->This is for arrays. this is a property
        //length()-->This is for strings. This is a method

        //Print the last color
        System.out.println(color[color.length-1]);

        //String Methods

        //ToCharArray
        String name = "Cydeo";
        char[] chars = name.toCharArray(); //[C, y, d, e, o] This is char Array
        //ShortCut: Alt+Enter-->IntroduceLocal Variable
        System.out.println(Arrays.toString(chars));
        //(char[0]+"") --> to use String method

        //Split
        String[] split = name.split("");//[C, y, d, e, o] This is String Array
        System.out.println(Arrays.toString(split));
        //split[0]-->you can use String method without any concatenation


        String a ="a b c a c b c";
        String[]abc = a.split(" ");
        System.out.println(Arrays.toString(abc)); //[a, b, c, a, c, b, c]

        //Hint for our IQ task
/*
        CHALLENGE
        Real Interview Task-->  Longest Repetitive Substring


        Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
        Your program should return longest substring K, and
        if there is none it should be return "There is no repetitive substring"

        For Example is str ="abcababcababcab"  			   output should be abcab
        str ="abcdefabcdef"     			   output should be abcdef

        str ="abcdefabcdef abcdefabcdef"    output should be abcdefabcdef
        str ="abcdefxabcdef"				   output should be "There is no repetitive substring"

*/
        a="abcabcabc";
        String[] abcs = a.split("abc"); //this will not print anything []

        System.out.println(Arrays.toString(abcs));

        System.out.println(abcs.length);//0



    }
}
