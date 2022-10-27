package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        //add/assign to an array[index] = value
        numbers.add(100); //adds 100 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-100);//adds -100 to the end of the ArrayList

        numbers.add(50);
        numbers.add(32);
        System.out.println(numbers);

        // in array how do we access each element: arr[index]

        System.out.println(numbers.get(0));
       // System.out.println(numbers.get(30)); outOfBounds

        //how do you know how many elements are in the array: arr.length

    }
}
