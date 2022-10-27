package day09_scanner;

import java.util.Scanner;

public class HomeWork2Angles {
    //        Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
//        Determine if the angles make a triangle, which means the angles add to 180.0
//        and
//        Determine if the angles make a circle, which means the angles add to 360.0

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // System.out.println("Enter 3 angle numbers");
        System.out.println("Enter angle1");
        double angle1 = input.nextDouble();
        System.out.println("Enter angle2");
        double angle2 = input.nextDouble();
        System.out.println("Enter angle3");
        double angle3 = input.nextDouble();
        double total = angle1 + angle2 + angle3;
        boolean isATriangle = total==180.0;
        boolean isACircle = total==360.0;
        System.out.println("Does angles make a triangle: " + isATriangle);
        System.out.println("Does angles make a circle: " + isACircle);



    }



}
