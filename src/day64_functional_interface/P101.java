package day64_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class P101 {
    public static void main(String[] args) {
        /*
         1.1 Create a function that can check if two array are equal and contains the same elements
                        ex: arr1 = {3,2,1}
                            arr2 = {2,1,3}

                        output: true
         */
        BiPredicate<Integer[], Integer[]> sameElements = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };
        Integer [] a = {3,2,1};
        Integer [] b = {2,1,3};
        System.out.println(sameElements.test(a, b));
        System.out.println("-------------------------------------");


        /*
        1.2 Create a function that can check if the first array contains all the elements of the second array:
        ex: arr1 = {1,2,3,4,5,6}
        arr2 = {7,8}
        output: false
        */

        BiPredicate<Integer [], Integer[]> contains2 = (arr1, arr2) -> {
            int n=0;
            for (int i = 0; i <arr1.length ; i++) {
                for (int j = 0; j <arr2.length ; j++) {
                    if(arr1[i]==arr2[j]){
                        n++;//I don't understand
                    }
                }
            }
            return(n==arr2.length); //I don't understand
        };

        Integer [] arr1 = {1,2,3,4,5,6};
        Integer arr2[] = {1,2,3,7};
        System.out.println(contains2.test(arr1, arr2));
    }
}
