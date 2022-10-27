package group_task.task5;

import day2_04_11_2022.ArrayVsArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveAhmed {
//    1. ArrayList -- Remove "Ahmed"
//    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
//    Write a java operation to remove all the names named Ahmed.

//    public static ArrayList<String>RemoveAhmed(ArrayList<String>names) {
//        names.removeIf(name->names.contains("Ahmed"));
//        return names;
//    }

        public static ArrayList<String> removeAhmed (ArrayList<String> names){
            names.removeIf(name -> name.contains("Ahmed"));
            return names;
        }

        public static void main(String[] args) {
            ArrayList<String> name = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
            System.out.println(removeAhmed(name));
        }
    }


