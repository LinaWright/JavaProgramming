package group_task.task2;

import java.util.*;

public class T01_FrequencyOfCharacters {
    /*
1) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

//    public static void main(String[] args) {
//        Map<Character,Integer> map = new LinkedHashMap<>();
//        String str = "BBCCsA";
//        for (int i = 0; i <str.length() ; i++) {
//            char letter =str.charAt(i);
//            if (map.containsKey(letter)){
//                map.put(letter,map.get(letter)+1);
//            }else {
//                map.put(letter,1);
//            }
//        }
//        System.out.println(map);
//    }



        public static String frequencyOfCharacters (String str){
            ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split("")));
            String output = "";
            for(String each: list){
                int frequency = Collections.frequency(list,each);
                if(output.contains(each)){
                    continue;
                }
                output += each + frequency;
            }
            return output;
        }

        public static void main(String[] args) {
            System.out.println(frequencyOfCharacters("AAABBCDD"));
        }
}


