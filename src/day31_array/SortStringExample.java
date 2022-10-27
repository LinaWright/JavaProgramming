package day31_array;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String[]arr={"java","Hello","$Dollar","4four","five5","Zebra","Six","six","Hi"};//sort in order of ascii table
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
