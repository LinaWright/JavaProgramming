package group_task.task3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortAscending {
    /*
    Array - Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays

    class
    Ex:
    int[] arr = {10, 9, 8, 7};
    arr = Sort(arr);         ==>{ 7, 8, 9, 10};

     */

    public static int[]sortedAscending(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmp = 0; //temporary variable in order to compare.
                if (arr[j] < arr[i]) {
                    //compare outer loop object with inner loop
                    tmp = arr[i];               // if greater than swapping.
                    arr[i] = arr[j];            // Swapping code here.
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,3,4,5};
        System.out.println(Arrays.toString(sortedAscending(arr)));
    }


    /*
    Solution 2 using sort method

    public static List sortAscending (int[]arr){
        List list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(sortAscending(arr));
    }

     */
}
