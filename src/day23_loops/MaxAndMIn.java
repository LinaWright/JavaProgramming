package day23_loops;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMIn {
    public static void main(String[] args) {
        System.out.println("------------------approach one------------------");
        Scanner input = new Scanner(System.in);


        int max = -2147483648;
        int min = 2147483647;

        int n = 0;

        while(n < 5){
            n++;

            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > max){
                max = number;
            }

            if(number < min){
                min = number;
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("------------------approach two------------------");

        int [] nums = {3, 6, 2, 68, 32, -2, 24};
        int [] notSorted = nums; // does not maka a new array object
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        // Q: Max and Min from Array
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length - 1]);

    }
}
