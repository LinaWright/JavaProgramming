package day35_methods;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = addElement(a, 4);
        System.out.println(Arrays.toString(b));

        String[] c = {"hello", "hi", "bye"};
        String[] d = addElement(c, "yay");
        System.out.println(Arrays.toString(d));

        int[] e = {1, 2, 3, 4};
        int[] f = {3, 23, 6};
        System.out.println(Arrays.toString(addElement(e, f)));


    }

    public static int[] addElement(int[] original, int elementToAdd) {
        int[] newArray = new int[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        // Instead of doing a loop ourselves, we could have used Arrays.copyOf()
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

    public static String[] addElement(String[] original, String elementToAdd) {
        String[] newArray = new String[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

    public static int[] addElement(int[] original, int[] elementsToAdd) {

        int[] newArray = new int[original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArray.length; i++) {

            if (i < original.length) {
                // added the elements from the original array in the new array
                newArray[i] = original[i];
            } else {
                // added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }

        }

        return newArray;
    }
}

    /*
    Add Element
    create a method that will accept an int array and an int number. Return an
    array with the given number added to the end of the array
     */