package day23_loops;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int check = 132;
        String str = "";

        if(check%2==0){
            str +=check;
            if(check%5==0){
                str +="132";
            }else{
                str="500";
            }
        }else{
            str +="123";
        }
        System.out.println(str);

        int num = +5;
        System.out.print(num++ + ",");
        System.out.print(num=0);
        System.out.print("," + --num);

        System.out.println();
        long l = 100;
        short s = (short)l;
        System.out.println(s+10);

        int a=5;
        byte b = (byte)a;//casting
        System.out.println(b);


    }
}


