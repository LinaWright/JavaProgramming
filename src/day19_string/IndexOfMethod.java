package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s = "pen";
        System.out.println(s.indexOf("p")); //0
        System.out.println(s.indexOf("e")); //1
        System.out.println(s.indexOf("n")); //2

        System.out.println(s.indexOf("x")); //if the character is not in the String, it'll return -1

        System.out.println(s.indexOf("pe")); //if there is multiple character, it finds the sequence of "pe" and it'll return the index of the
        // first character index number
        System.out.println(s.indexOf("pz")); //The String doesn't have the sequence of "pz", so it'll return -1
    }
}
