package day18_string;

public class emptyAndBlank {
    public static void main(String[] args) {
        String str = "Last example";
        System.out.println(str.isEmpty());

        str = "";
        System.out.println(str.isEmpty());//true

        String s = " ";

        System.out.println(s.isEmpty()); //false space is a character

        System.out.println(s.isBlank()); // ture
    }
}
