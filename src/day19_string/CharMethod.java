package day19_string;

public class CharMethod {
    public static void main(String[] args) {
        String s= "java";
        //         0123
        System.out.println(s.length()); //4

        System.out.println(s.charAt(0)); //j
        System.out.println(s.charAt(1)); //a
        System.out.println(s.charAt(2)); //v
        System.out.println(s.charAt(3)); //a
        //invalid System.out.println(s.charAt(4));

        int lastIndex = s.length() - 1; //4-1=3
        System.out.println("Last char: " + s.charAt(lastIndex)); //This is the same as line12, but line12 is hard coded.

        int secondToLastIndex = s.length() -2;
        char secondToLastChar = s.charAt(secondToLastIndex); // this the same as line11
        System.out.println("second to last character: " + secondToLastChar);
    }
}
