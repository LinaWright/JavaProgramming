package group_task.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingInAscending {
    /*
    3. ArrayList -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */
    public static ArrayList<Integer>sortAscending (ArrayList<Integer>arr){

        for (int i = 0; i < arr.size(); i++) {
        for (int j = i+1; j < arr.size(); j++) {
            if (arr.get(j) < arr.get(i)) {
                Integer tmp = arr.get(i);               // if greater than swapping.
                arr.set(i,arr.get(j));            // Swapping code here.
                arr.set(j,tmp);
            }
        }
    }
        return arr;
    }
    public static ArrayList<Integer>sortDescending (ArrayList<Integer>arr){

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    Integer tmp = arr.get(i);               // if greater than swapping.
                    arr.set(i,arr.get(j));            // Swapping code here.
                    arr.set(j,tmp);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(8,7,5,9,8,4,2));
        System.out.println(sortAscending(arr));
        System.out.println(sortDescending(arr));
    }
}
/*
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
 */