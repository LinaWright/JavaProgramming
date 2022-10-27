package group_task.task3;

import java.util.Arrays;

public class ArraySortDescending {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static int[] sortedDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmp = 0;
                if(arr[j] > arr [i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,9,7,3,4,5};
        System.out.println(Arrays.toString(sortedDescending(arr)));
    }
}

