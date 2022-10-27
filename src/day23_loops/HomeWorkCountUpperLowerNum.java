package day23_loops;

public class HomeWorkCountUpperLowerNum {
    public static void main(String[] args) {
        String input = "2juMp41EEkd4s4";
        int lowerCase = 0;
        int upperCase = 0;
        int num = 0;
        for (int i = 0; i < input.length(); i++) { // the purpose of the loop was to check every character anf see is it uppercase lowercase
            // or a number. We want the loop to finish while every character was checked, Then it will print one time after the loop the result
            if(input.charAt(i)>='a' & input.charAt(i)<='z'){
                lowerCase++;
            }
        }System.out.println("lowerCase = " + lowerCase);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' & input.charAt(i) <= 'Z') {
                upperCase++;
            }
        }
        System.out.println("upperCase = " + upperCase);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 & input.charAt(i) <= 57) {
                num++;
            }
        }
        System.out.println("num = " + num);
    }
}
/*Saim's code
  String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i); // get the character at the index number i for this iteration, and stores into the variable letter for re-usability

            if(letter >= 'A' && letter <= 'Z'){
                upper++;
            } else if (letter >= 'a' && letter <= 'z') {
                lower++;
            } else if(letter >= '0' && letter <= '9'){
                number++;
            }

        }

        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lowercase characters: " + lower);
        System.out.println("Number characters: " + number);
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase
letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5 numbers
 */