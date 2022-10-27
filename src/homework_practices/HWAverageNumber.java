package homework_practices;

import java.util.Scanner;

public class HWAverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number?");
        int howMany = input.nextInt();
        int [] number = new int[howMany];

        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter the numbers");
            number[i] = input.nextInt();
            sum += number[i];
        }
        System.out.println("Average number is " + sum/howMany);
    }
}
/*

    public static void main(String[] args) {

        int [] nums = {10, 15, 5, 6};
        int sum = 0;

//        for (int i = 0; i < nums.length; i++){
//            sum += nums[i];
//        }

        for(int each: nums){
            sum += each;
        }

        System.out.println("average: " + (sum/nums.length));
Average Number from Array
Given an int array calculate the average number
-> Make it flexible so it will work with any array size
Examples:
[1,2,3] -> average: 2
[10, 15, 5, 6] -> average: 9
[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */