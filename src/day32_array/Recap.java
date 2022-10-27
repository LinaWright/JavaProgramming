package day32_array;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int[] arr = {30, 90, 60, 180, 360};
        int[] arr2 = {180, 360, 30, 60, 90};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Before sorting: " + Arrays.equals(arr, arr2));//false, the order is not the same

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("After sorting: " + Arrays.equals(arr,arr2));

        String[]words={"Hello","Java","Saturday"};
        System.out.println(String.join("###",words));

        String str = "Today is Saturday";
        System.out.println(Arrays.toString(str.toCharArray()));//return char[]as a String type
        System.out.println(Arrays.toString(str.split(" ")));//return String[]as a String type
    }
}
