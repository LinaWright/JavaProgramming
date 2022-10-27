package homework_practices;

public class HWReversEachWord {
    public static void main(String[] args) {
        String str ="It started to snow in Chicago";
        String []arr=str.split(" ");
        String result="";


        for (String each : arr) {
            String backWord="";

            for (int i = each.length()-1, j=0 ; i >=0 ; i--,j++) {

                backWord+=each.charAt(i);
            }
            result+=backWord+" ";

        }
        System.out.println(result);
    }}
/*
public class HWReversEachWord {// TODO: 3/16/2022

    public static void main(String[] args) {
        String input = "It started to snow in Chicago";
        String[] eachWord = input.split(" ");

        String reversed = "";
        //System.out.println(Arrays.toString(eachWord)); --> [It, started, to, snow, in, Chicago]
        for (int i = 0; i < eachWord.length; i++) {
            char[] eachChar = eachWord[i].toCharArray();
            // System.out.println(eachChar);
                        /*
                        It
                        started
                        to
                        snow
                        in
                        Chicago
                         */
/*
            for (int j = eachChar.length - 1; j >= 0; j--) {//make each char reversed and add it to the reverse String

                reversed += eachChar[j]; // print out this reversed, "tIdetratsotwonsniogacihC" there will be no space in between words

            }

        }
        System.out.println(reversed);
    }

}

*/
/*

Reverse Each word

Given a String, reverse each individual word and print the result
Hint: Use a nested loop, split

Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacihC
 */