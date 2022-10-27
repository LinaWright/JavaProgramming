package group_task.task1;

public class T04_SwapNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: " + " x= " + x + " y = " + y);
    }
}
/*
4) Numbers - Swap Numbers
Swap two variable' values without using a third variable
The idea is to get a sum in one of the two given numbers. The numbers can then be swapped using the sum and subtraction from the sum.
 */