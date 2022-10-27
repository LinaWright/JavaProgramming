package day13_if_statements;

import java.util.Scanner;

public class Replit5 {
    //    SDET Motors Inc. is recalling all vehicles from model years:
//            1995-1998,
//            2001-2002,
//            2004-2006,
//            2015-2017
//    Given the vehicleYear determine if the vehicle is being recalled or not
//    If the year is from included in the recall year list print: Your vehicle needs to be recalled!
//
//    If the year is not one of the recall years print: Your vehicle is fine, enjoy!
//
//    Main topics: if statements, primitive variables, operators
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();
        if(vehicleYear>=1995 && vehicleYear<=1998){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear>=2001 && vehicleYear<=2002){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear>=2004 && vehicleYear<=2006){
            System.out.println("Your vehicle needs to be recalled!");
        }else if(vehicleYear>=2015 && vehicleYear<=2017){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}
