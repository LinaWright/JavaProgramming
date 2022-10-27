package day25_Recap;

import java.util.Locale;

public class HomeworkCamelCase {
    public static void main(String[] args) {
        //This code is hard coded, Saim's code in the comments is more dynamic
        String str = "Today is SUNDAY";

        String firstWord = str.substring(0, str.indexOf(' '));
        str = str.replace(firstWord, "");
        str = str.trim();
        String secondWord = str.substring(0,str.indexOf(' '));
        str = str.replace(secondWord, "");
        str = str.trim();
        String thirdWord = str.substring(0,str.length());
        firstWord = firstWord.toLowerCase(Locale.ROOT);
        secondWord = (""+secondWord.charAt(0)).toUpperCase(Locale.ROOT) + secondWord.substring(1,secondWord.length()).toLowerCase(Locale.ROOT);
        thirdWord = (""+thirdWord.charAt(0)).toUpperCase(Locale.ROOT) + thirdWord.substring(1,thirdWord.length()).toLowerCase(Locale.ROOT);
        System.out.println(firstWord+secondWord+thirdWord);

    }
}
/*

 Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();
        String camelCase = str.substring(0, 1); // I'm putting the first character into the String right away, because my loop will start from i = 1. It starts from i = 1 because I am doing i - 1 to check for spaces and I don't want to do this in the first iteration

        for(int i = 1; i < str.length(); i++){

            if(str.charAt(i - 1) == ' '){
                camelCase += str.substring(i , i + 1).toUpperCase(); //("" + str.charAt(i)).toUpperCase(). sub(i , i + 1) is the same as charAt(i) but the types are different

            } else {
                camelCase += str.charAt(i); //today
            }

        }

        System.out.println(camelCase.replace(" ", "")); //


Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with
an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday
 */