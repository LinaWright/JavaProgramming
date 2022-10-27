package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Apples";
        System.out.println(str.startsWith("App")); //true
        System.out.println(str.startsWith("app")); //false

        System.out.println(str.startsWith("Apples")); //true

        String str2 = "A";
        System.out.println(str.startsWith(str2)); //true, does the String str start with the String str2.

        System.out.println(str.startsWith(" App")); // false, space is a character in the String
        System.out.println(str.startsWith(   "App")); //true, the code does not care about space, it doesn't affect the String

        System.out.println(str.startsWith("Aoo")); // It checks the whole sequence. false

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today")); //true
        System.out.println(sentence.endsWith("day"));//true
        System.out.println(sentence.endsWith(" day"));//true
        System.out.println(sentence.endsWith("good"));//false
    }
}
