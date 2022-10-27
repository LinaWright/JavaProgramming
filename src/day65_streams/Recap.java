package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {
         /*
        1.1 Create a function that can check if two array are equal and contains the same elements
                       ex: arr1 = {3,2,1}
                           arr2 = {2,1,3}

                       output: true
        */
        BiPredicate<int[], int[]> sameElements = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };
        int [] a = {3,2,1};
        int [] b = {2,1,3};
        System.out.println(sameElements.test(a, b));

        /*
        1.2 Create a function that can check if the first array contains all the elements of the second array:
        ex: arr1 = {1,2,3,4,5,6}
        arr2 = {1,8}
        output: false
        */

        BiPredicate<int[],int[]>firstContains = (array1, array2) -> {
           for(int outer : array2){
               boolean check = false;
               for(int inner : array1){
                   if(outer == inner){
                       check = true;
                       break;
                   }
               }
               if(!check){
                   return false; //because the number was not in the first array
               }
           }
           return true;
        };

        // merge two arrays into a list
        // first two generics are for the parameters
        // last generic is for the return type

        // 1, 2, 3
        // 4, 5, 6
        BiFunction<int[], int [], List<Integer>> mergeToList = (array1, array2) -> {

            List<Integer> list = new ArrayList<>();

            for(int i = 0 ; i < array1.length; i++){
                list.add(array1[i]);
                list.add(array2[i]);
            }
            return list;
        };

        int [] arr5 = {1, 2, 3};
        int [] arr6 = {4, 5, 6};
        System.out.println(mergeToList.apply(arr5, arr6));
    }
}
