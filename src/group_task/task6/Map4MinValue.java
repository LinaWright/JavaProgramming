package group_task.task6;

import java.util.HashMap;
import java.util.Map;

public class Map4MinValue {
    /*
    4.Map -- Min value
Write a method that can return the minimum value from ta map (DO NOT use sort method)
     */
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>(); //random order.
        map.put("James", 70000.0);
        map.put("Jane", 1240000.0);
        map.put("Ana", 140000.15);
        map.put("Jorge", 4245250.23);
        map.put("Elza", 1231312.1);
        map.put("Peter", 131234.0);
        System.out.println(minValue(map));
    }
    public static double minValue(Map<String, Double> map) {

        double lowestSalary = Double.MAX_VALUE;
        for (String key : map.keySet()) {
            double value = map.get(key); //Returns the value to which the specified key, I use double because it's for salary
            if (value < lowestSalary) {
                lowestSalary = value;  //70000
            }
        }
        return lowestSalary;
    }

    public static double maxValue(Map<String, Double> map) {

        double highestSalary = Double.MIN_VALUE;
        for (String key : map.keySet()) {
            double value = map.get(key); //Returns the value to which the specified key
            if (value > highestSalary) {
                highestSalary = value;  //70000
            }
        }
        return highestSalary;
    }
}
/*
 public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("James", 70);
        ages.put("Jane", 30);
        ages.put("Ana", 14);
        ages.put("Jorge", 42);
        ages.put("Peter", 23);

        String oldest = "";
        int min = Integer.MAX_VALUE;
        // We can't declare 0, because 0 is the smallest number. Integer.Max_Value gives us the biggest number on integer

        String youngest= "";
        int max =0;

        //Use the created map to find the following:
        for (String key : ages.keySet()) { // iterate through the keys
            int value = ages.get(key); //we use get method to read the values by the key

            //    1.1 who has the maximum age in the group?
            if (value > max) {
                oldest = key;
                max = value;
            }
//    1.2 who has the minimum age in the group?
            if (value < min) {
                youngest = key;
                min = value;
            }
        }
        System.out.println("Max: " + oldest + " " + max);
        System.out.println("Min: " + youngest + " " + min);

    }
 */