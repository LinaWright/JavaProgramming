package Interview_questions.java;

import java.util.Locale;

public class Anagram {
public static boolean AnagramCheck(String str1, String str2){
    str1 = str1.toLowerCase(Locale.ROOT).replace(" ","");
    str2 = str2.toLowerCase(Locale.ROOT).replace(" ","");
    boolean isAnagram = false;
    if(str1.length() == str2.length()){
        for (int i = 0; i < str1.length(); i++) {
            char each = str1.charAt(i);
            str2 = str2.replace(each+"", "");
            if(str2.isEmpty()){
                isAnagram = true;
            }else {
                isAnagram = false;
            }
        }
    }else {
        isAnagram = false;
    }
    return isAnagram;
}

    public static void main(String[] args) {
        String str1 = "a gentleman";
        String str2 = "elegant man";
        System.out.println(AnagramCheck(str1, str2));
    }
}
