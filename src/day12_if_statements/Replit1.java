package day12_if_statements;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Replit1 {
//    Use if statements to determine if the given int num is positive, negative, or zero. Only print one of these three options.
//            Note: Can be done with 3 separate if statement or a multi branch if statement
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("0");
        }
    }
}
