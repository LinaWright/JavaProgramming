package group_task.task4;

import java.sql.Array;
import java.util.Arrays;

public class ArrayMove0ToTheEnd {
    /*
     Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moveZeros (int[]arr){
      int[]sortedArray = new int[arr.length];
      int indexNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                sortedArray[indexNumber] = arr[i];
                indexNumber++;
            }
        }
      return sortedArray;
    }

    public static void main(String[] args) {
        int[]arr = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }
}
