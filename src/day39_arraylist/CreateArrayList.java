package day39_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String>ListOne = new ArrayList<>();
        ListOne.add("hello");
        ListOne.add("bye");
        System.out.println(ListOne);

        ArrayList<String>listTwo = new ArrayList<>(ListOne); //adds the elements from the ListOne arraylist into the ListTwo

        listTwo.add("Hola");
        System.out.println(ListOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("one","two","three"));//Give an initial value
        System.out.println(listThree);

        //ArrayList<String> listFour = new ArrayList<>("four", "five", "six"); not valid
    }
}
