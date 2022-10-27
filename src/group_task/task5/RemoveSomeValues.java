package group_task.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
    /*
     ArrayList -- Remove some values.
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static ArrayList<Integer> removeValues(ArrayList<Integer> list){
        list.removeIf(num->num>100);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,5,10,20,89,105,200));
        System.out.println(removeValues(num));
    }
}
