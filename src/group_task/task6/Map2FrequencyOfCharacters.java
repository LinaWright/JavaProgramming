package group_task.task6;

import java.util.HashMap;
import java.util.Map;

public class Map2FrequencyOfCharacters {
    //Write a method that prints the frequency of each character from a String
//    public static void main(String[] args) {
//        String str ="AAABBCDD";
//        Map<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i <str.length() ; i++) {
//            char letter = str.charAt(i);
//            if (map.containsKey(letter)){
//                map.put(letter,map.get(letter)+1);
//            }else {
//                map.put(letter,1);
//            }
//        }
//        System.out.println(map);
//    }

    public static Map<Character, Integer> frequencyOfCharacters(String args) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < args.length(); i++) {
            char letter = args.charAt(i);
            if (frequencyMap.containsKey(letter)) {
                frequencyMap.put(letter, frequencyMap.get(letter) + 1); //A, 3
            } else {
                frequencyMap.put(letter, 1); //C, 1
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }
}
/*
  public static void main(String[] args) {
         frequencyOfEachChar("apple");
     }
    public static void frequencyOfEachChar(String str){



        Map<Character, Integer> counter = new LinkedHashMap <>();
        //key will be the character, value will be number
        for (int i = 0; i<str.length();i++){

            char key = str.charAt(i); //instead of calling this many times


            if (counter.containsKey(key)){ // counter is our map. this will look every single character.

                //this is a duplicate letter, it is found before. we will need to update the counter for it, which is the value in our map

                counter.put(key, counter.get(key)+1); //counter.get() is the method from the map to get the value of the previous counter, then we add 1 to that number, then assigns that result as the new value linked to that key

                        }else{
                //the map does not contain the letter/char -> which means this is the first time the character was found, so we should add it to the map
                counter.put(key,1);
            }

    }

        System.out.println(counter);
    }

}
 */