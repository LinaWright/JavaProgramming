package homework_practices;

import java.util.Scanner;

public class TriangleCircle {
    public static void isTriangle (int[]nums){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
            sum += nums[i];
            if (sum == 180){
                System.out.println("This is a triangle");
            }else if (sum == 360){
                System.out.println("This is a circle");
            }
        }
    }

    public static void main(String[] args) {

    }

}
