package group_task.task3;

public class SumOfDigitsInAString {
    /*
     String - sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */
    // Function to calculate sum of all numbers present
    // in a string containing alphanumeric characters
    public static int findSum(String str) {
        // A temporary string
        String temp = "0";

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch)) {
                temp += ch;
            }
                // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
        }

        // atoi(temp.c_str()) takes care of trailing
        // numbers
        return sum + Integer.parseInt(temp);
    }

    // Driver code
    public static void main(String[] args) {

        // input alphanumeric string
        String str = "12abc20yz68";

        // Function call
        System.out.println(findSum(str));
    }
}
    /*
        public static int sum (String str) {
            int sumOfDigits = 0;

            for (int j = 0; j < str.length(); j++) {
                if(Character.isDigit(str.charAt(j))){
                    sumOfDigits += Integer.parseInt(str.charAt(j) + "");
                }
            }

            return sumOfDigits;
        }

     */

    /*
    public static int sum(String str) {
        int sum = 0;
        String digit = "0";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                digit += str.charAt(i);
            } else {
                sum += Integer.parseInt(digit);
                digit = "0";
            }
        }
        sum += Integer.parseInt(digit);
        return sum;
    }

        public static void main (String[]args){
            System.out.println(sum("kjdsfhsdhf12kfkdf2"));
        }

     */


