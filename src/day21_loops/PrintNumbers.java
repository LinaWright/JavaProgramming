package day21_loops;

public class PrintNumbers {
    /*
    print all the even numbers from 1 to 100, on separate lines

        print all the odd numbers from 1 to 100, but all in one line with spaces between each number
     */

    public static void main(String[] args) {
//        approach 1
//        int num = 2;
//
//        while(num<=100){
//            System.out.println(num);
//            num = num + 2;

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println();

        //odd numbers
        //approach 1
//        int a = 1;
//        while(a<=100){
//            System.out.print(a + " ");
//            a+=2;

        int a=0;
        while(a++<100){
            if(a%2==1){
                System.out.print(a + " ");
            }
        }


        /*
            flow:
            b = 0
            b++ <= 100 --> 0 <= 100 --> loop runs and b increments to 1
             if (b % 2 == 1) --> 1 % 2 == 1 --> true -> prints number

             while(b++ <= 100) --> 1 <= 100 --> loop runs and b increments to 2
             if (b % 2 == 1) --> 2 % 2 == 1 --> false -> nothing happens

              while(b++ <= 100) --> 2 <= 100 -> loop runs and b increments to 3
         */


    }
}

