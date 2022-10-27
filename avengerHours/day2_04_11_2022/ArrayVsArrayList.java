package day2_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    /*
    ArrayList -> is a data structure, a member of collection framework

    A class of java that is similar to array but only allows us to store only objects

    Size is dynamic
    -what does it mean?

    has its own methods (unlike array) add(), get(), remove()
    Why does arrays have methods? sort(), binarySearch()?
     */

    public static void main(String[] args) {
        //declaring an array
        int[]arr1 = new int[0]; //accepts abj and primitive


        //declaring an array
        ArrayList<Integer>list1; //must be object type

        //instantiating arrayList
        arr1 = new int[4]; //[0,0,0,0] ->4
        arr1[0] = 100; //[100,0,0,0] -> length = 4

        list1 = new ArrayList<>(); //[]->size = 0;
        list1.add(100); //[100] ->size = 1
        list1.remove(0); //[] -> size = 0

        int number = 50;
        list1.add(number); //autoboxing
        System.out.println(list1);
        list1.get(0); //wrapper class Integer
        //int number still primitive

        //initializing an array with specific values
        Integer[]arr2={1,2,3};//[1,2,3]

        //initializing an arrayList with specific values
        ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(1,2,3,4));

        ArrayList<Integer>list4 = new ArrayList<>(Arrays.asList(arr2));
    }
}
