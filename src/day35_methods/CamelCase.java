package day35_methods;

import java.util.Locale;

public class CamelCase {
    public static String camelCase(String str) {
        String[] s = str.split(" ");
        String firstWord = s[0].toLowerCase(Locale.ROOT);
        String restWords = "";
        for (int i = 1; i < s.length; i++) {
            restWords += s[i].substring(0, 1).toUpperCase(Locale.ROOT) + s[i].substring(1).toLowerCase(Locale.ROOT);
        }
        return firstWord + restWords;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
    }
}
    /*
    Camel Case
    create a method that will accept a String, of words separated by spaces,
    and return a camel case version of the String where the first letter of
    each word is Uppercase and the rest of the word is in lowercase.
    Exception: First word starts with lowercase
    Ex:
    Input:
    JAVA will ruLE tHe wORLd
    Output:
    javaWillRuleTheWorld
     */