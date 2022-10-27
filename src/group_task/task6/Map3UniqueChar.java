package group_task.task6;
import day52_inheritance.hiding.A;

import java.util.HashMap;
import java.util.Map;

public class Map3UniqueChar {
    public static void main(String[] args) {
        String str = "AAABBCDDF";
        System.out.println(uniqueLetters(str));
    }
    public static String uniqueLetters (String str) {
        String unique = "";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                //A 2
            } else {
                map.put(str.charAt(i), 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                unique += entry.getKey();
            }
        }
        return unique;
    }


}
