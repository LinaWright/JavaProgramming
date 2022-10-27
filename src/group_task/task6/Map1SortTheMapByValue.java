package group_task.task6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Map1SortTheMapByValue {
/*
    1.Map -- Sort the map by values
Write a method that can sort the Map by values
 */
    public static Stream sortTheMap(Map<String, Integer> grades) {
        Stream<Map.Entry<String, Integer>> sorted = grades.entrySet().stream()
                                                          .sorted(Map.Entry.comparingByValue());
        //Using down casting, creating an object, so that we can use stream method.

        return sorted;
    }

    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Math", 98);
        grades.put("English", 88);
        grades.put("Civics", 96);
        grades.put("History", 92);
        grades.put("Art", 89);

        sortTheMap(grades).forEach(System.out::println);//allow to iterate through the elements
    }
}

/*
      public static void main(String[] args) {

        Map<String, String> unsortMap = new HashMap<>();
        unsortMap.put("Z", "z");
        unsortMap.put("B", "b");
        unsortMap.put("A", "a");
        unsortMap.put("C", "c");
        unsortMap.put("D", "d");
        unsortMap.put("E", "e");
        unsortMap.put("Y", "y");
        unsortMap.put("N", "n");
        unsortMap.put("J", "j");
        unsortMap.put("M", "m");
        unsortMap.put("F", "f");

        System.out.println("Unsort Map......");
        System.out.println(unsortMap);

        System.out.println("\nSorted Map......By Key");
        Map<String, String> treeMap = new TreeMap<>(unsortMap);
        System.out.println(treeMap);

    }}



 */

