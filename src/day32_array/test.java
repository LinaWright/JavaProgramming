package day32_array;

import java.util.Scanner;

public class test {
//    public static void main(String[] args) {
//        method1();
//    }
//
//    public static void method1(){
//        int n=5;
//        for (int i = 0; i < 5; i++) {
//            n+=i;
//        }
//        System.out.println(n);
//    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] a = new int[input.nextInt()];
    for (int i = 0; i < a.length; i++) {
        a[i]=input.nextInt();
    }
    method8(a);
}

    public static void method8(int[]arr) {
        for(int n:arr){
            if(n%2==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
