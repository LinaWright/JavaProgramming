package Day14_if_statements;

import java.util.Scanner;

public class Replit {
    /*
    Using if statements and Scanner write a program that will read three number inputs. Then using those number determine which number is the middle
    number. Follow the exact flow from the examples below.
Hint:
​
1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
copied!
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
Main topics: if statements, primitive variables, operators, Scanner
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();
        if(num1>=num2 && num1<=num3){
            System.out.println("middle number is:" + num1);
        }else if (num2>=num1 && num2<=num3){
            System.out.println("middle number is:" + num2);
        }else if (num3>=num1 && num3<=num2){
            System.out.println("middle number is:" + num3);
        }
    }
}
