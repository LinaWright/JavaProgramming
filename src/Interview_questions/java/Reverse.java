package Interview_questions.java;

import java.util.Arrays;

public class Reverse {
    public static String reversString (String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static int[] reverseArray (int[] arr){

        int [] reverse = new int[arr.length];

        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            reverse[j] = arr[i];
        }

        return reverse;
    }

    public static void main(String[] args) {
        String str = "lina";
        System.out.println(reversString(str));
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

}
