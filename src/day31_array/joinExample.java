package day31_array;

import java.util.Arrays;

public class joinExample {
    public static void main(String[] args) {
        String [] words = {"a", "b", "c"};
        System.out.println(Arrays.toString(words));

        System.out.println(String.join("<>", words));
        System.out.println(String.join("-----", words));
        System.out.println(String.join(" ", words));
        System.out.println(String.join("", words));
        System.out.println(String.join("\"", words));
    }
}
