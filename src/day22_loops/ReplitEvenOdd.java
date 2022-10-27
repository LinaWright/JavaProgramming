package day22_loops;

public class ReplitEvenOdd {
    public static void main(String[] args) {
        int even = 1;
        String evenNumber = "";
        while (even <= 20) {
            if (even % 2 == 0) {
                //evenNumber = evenNumber +even + "";
                evenNumber += even + " ";

            }
            even++;

        }
        System.out.print(evenNumber.trim());
        System.out.println();
        int odd = 1;
        String oddNumber = "";
        while (odd <= 19) {
            if (odd % 2 == 1) {
                oddNumber += odd + " ";
            }
            odd++;

        }
        System.out.println(oddNumber.trim());
    }
}
/*
Use a loop to print all the even numbers from 1 to 20. Print each number on the same line, with spaces between each
Use another loop to print all the odd numbers from 1 to 20. Print each number on the same line, with spaces between each
Note: In the end there will be two lines. First the line to show all the even numbers and then another line to show all the odd numbers
Main topics: loops, primitive datatypes, if statement, operators

Example Flow:

2 4 6 .... 18 20
1 3 5 .... 17 19
 */