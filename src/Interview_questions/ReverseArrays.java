package Interview_questions;

import java.util.Arrays;

public class ReverseArrays {
    /*
    2. Array reverse. Write a method that will take an array as an argument and reverse it.
     */
    // revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
    // revArr({1})             -> {1}
    // revArr({1, 2, 3})       -> {3, 2, 1}

    public static int[] revArr(int[] arrNum) {
        // we will use two 'pointers'. One pointer will start from the beginning
        // another one from the back and we will swap their values

        // pointer that will start from the back
        int j = arrNum.length - 1;

        // our loop will go till half of our input array
        // 'i' is a pointer that will start from the beginning
        for(int i = 0; i < arrNum.length / 2; i++) {
            // swap elements using positions of i and (j - i)
            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }
        return arrNum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(revArr(new int[]{1, 2, 3,4,5,6})));
    }

    // Time Complexity: O(n/2) but basically we can say O(n)
    // Note:
    // Array works with references(same objects) so if we will modify argument
    // it will have effect on an original array.
}
    /*
    public static void main(String[] args) {
        int[] numbers = {6, 8, 3, 4, 5};
        int[] reverse = new int[numbers.length];
        int count = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[count] = numbers[i];
            count++;
        }
        System.out.println(Arrays.toString(reverse));
    }
}
/* saim's code
public class ReverseArray {

public static void main(String[] args) {

    int [] arr = {1, 2, 3, 4, 5};
    int [] reverse = new int[arr.length];

//        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
//            reverse[j] = arr[i];
//        }

    for(int i = 0; i < arr.length; i++){
        reverse[arr.length - 1 - i] = arr[i];
    }

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(reverse));

        /*
           i = 0
           reverse[arr.length - 1 - i] = arr[i];
           reverse[5 - 1 - 0] = arr[0];
           reverse[4] = arr[0];

           i = 1
           reverse[arr.length - 1 - i] = arr[i];
           reverse[5 - 1 - 1] = arr[1];
           reverse[3] = arr[1];
Reverse Array
Write a program that will reverse the order of any given array
Ex:
Input:
[1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
 */

