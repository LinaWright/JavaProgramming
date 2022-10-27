package day21_loops;


public class HomeworkAToZ {
    public static void main(String[] args) {
//        write a program that will print all the alphabet letters in uppercase from 'A' to 'Z'
        //ASCII A - Z --> 65 - 90

        int num = 65;

        while (num >= 65 && num <= 90) {

            char letter = (char) num;
            System.out.println(letter);
            num++;
        }
//        write a program that will print all the alphabet letters backwards in lowercase from 'a' to 'z'
//      a-->z  97-->122
        System.out.println();
        int num2 = 97;

        while (num2 >= 97 && num2 <= 122) {

            char letter2 = (char) num2; //casting
            System.out.println(letter2);
            num2++;
        }
    }
}

/* Saim's code
 // a - z lowercase

        char lowercaseUp = 'a';

        while(lowercaseUp <= 'z'){
            System.out.print(lowercaseUp + " ");
            lowercaseUp++;
        }

        System.out.println();
        // Z - A uppercase

        char uppercaseBack = 'Z'; // int i = 122

        while(uppercaseBack >= 'A'){  // i >= 97
            System.out.print(uppercaseBack + " "); // (char)i
            uppercaseBack--;
        }
 */
