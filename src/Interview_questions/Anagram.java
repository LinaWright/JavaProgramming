package Interview_questions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("------------------approach one------------------");
        String a = "a gentleman";
        String b = "elegant man";

        // removed all the spaces from the Strings
        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");

        //System.out.println(a);
        //System.out.println(b);

        if (a.length() == b.length()) {  // this is the precondition to check anagram or not

            for (int i = 0; i < a.length(); i++) {

                char each = a.charAt(i);

                b = b.replaceFirst(each + "", "");

            }

            if (b.isEmpty()) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
        System.out.println("------------------approach two------------------");
        String str = "listen";
        String str2 = "silent";

        char [] one = str.toCharArray();
        char [] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        if(Arrays.equals(one, two)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        System.out.println(Arrays.equals(one, two) ? "Anagram" : "Not Anagram");
    }
}
