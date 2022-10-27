package group_task.task2;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class T02_SameLetters {
    /*
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false
     */
    public static boolean sameLetters (String str, String str2) {
        boolean same = false;
        for (int i = 0; i < str.length(); i++) {
            str2 = str2.replaceFirst(str.charAt(i) + "", "");
        }
        // System.out.println(b.isEmpty()?"Same letter":"Not Same letter");
        if (str2.isEmpty()) {
            same = true;
        } else {
            same = false;
        }
        return same;

    }


    public static void main(String[] args) {
//        System.out.println(sameLetters("abc","cba"));
        System.out.println(sameLetters("abcdterrg","rgdctebae"));
    }

/*
Works for Anagram or sameLetters
    BiPredicate<String, String> anagram = (one, two) -> {

        char [] oneArr = one.toCharArray();
        char [] twoArr = two.toCharArray();
        Arrays.sort(oneArr);
        Arrays.sort(twoArr);

        return Arrays.equals(oneArr, twoArr);

    };

        System.out.println(anagram.test("listen", "silent")); // true
 */
    /*
    String a = "abc";
        String b = "cba";
  char c1 [] = a.toCharArray();
        char c2 [] = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1,c2));
     */

}

//The code below id from my practice, it doesn't work
//        boolean sameLetter = false;
//
//        if (str.length()==str2.length()){
//            for (int i = 0; i < str.length(); i++) {
//                for (int j = 0; j < str2.length(); j++) {
//                    if((str.charAt(i)+"").equals(str2.charAt(j)+"")){
//                        sameLetter = true;
//                    }
//                }
//            }
//        }else{
//            sameLetter = false;
//        }
//        return sameLetter;



//    public static boolean same(String str1, String str2) { // defining 2 strings
//
//
//        if (str1.length() != str2.length())  //if str1's length is not equal to str2 length, it is false
//            return false;
//
//        boolean isSame = true;
//
//        if (str1.length() == str2.length()) {
//            for (int i = 0; i < str2.length(); i++) {
//
//                if (!str2.contains(str1.charAt(i) + "") || !str1.contains(str2.charAt(i) + "")) {
//                    isSame = false;
//                }
//            }
//        }
//        return isSame;


//    }
