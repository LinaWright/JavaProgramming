package day28_arrays;

import java.util.Arrays;

public class ArrayIntros {
    public static void main(String[] args) {
        double [] arr = new double[4];
        System.out.println(Arrays.toString(arr));//[0.0, 0.0, 0.0, 0.0]

        System.out.println(arr.length);//4
        arr[0]=30.99;
        System.out.println(Arrays.toString(arr));

        arr[1]=12.55;
        arr[2]=10.20;
        arr[3]=5;
        System.out.println(Arrays.toString(arr));

        //reassigning
        arr[2]=2000;
        System.out.println(Arrays.toString(arr));

        arr = new double[5]; //Creates a new array with 5 elements., and reassigns the arr to the new object

        System.out.println(Arrays.toString(arr));

    }
}
