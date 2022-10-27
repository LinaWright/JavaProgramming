package day35_methods;

import my_utilties.StringUtil;

public class DuplicateCharacter {
            /*
                Duplicate Characters
        create a method that will accept a word(String) and return a String with
        all the duplicate characters. A character is duplicate if it only appears
        in the String multiple times
        Hint: use your frequency method to do some of the work
        Ex:
        Input:
        aaaaabcccdeeff
        Output:
        acef
         */

    public static String duplicateCharacters(String str) {
        String duplicate = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            if (!checked.contains("" + str.charAt(i))) {
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);
                if (count > 1) {
                    duplicate += str.charAt(i);
                }
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCharacters("aaaaabcccdeeff"));
    }
}

