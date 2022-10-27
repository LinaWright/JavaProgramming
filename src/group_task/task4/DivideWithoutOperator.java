package group_task.task4;

public class DivideWithoutOperator {
    /*
    Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator.

     */

    public static int divide (int number1, int number2){
        int count = 0;
        while(number1 >= number2){
            number1 -= number2;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 3;
        System.out.println(divide(number1,number2));
    }
}
