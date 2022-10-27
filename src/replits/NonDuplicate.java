package replits;

import java.util.Scanner;

public class NonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count <= 1) {
                num = nums[i];
            }
        }
        System.out.println(num);
    }
}
    /*
    Given an int [] nums that has duplicate numbers, which means each numbers is found twice in the array. Find and print the non-duplicate number,
    which mean the ones that does not have two occurrences of it
    Main topics: arrays, primitive datatypes, index, operators, loops, if statements, counter

    Example:

    Input:
      [1, 2, 3, 4, 3, 4, 1]

    Output:
      2
     */