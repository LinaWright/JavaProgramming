package day19_string;

public class MergeStrings {
    public static void main(String[] args) {
        /*
        teo Strings: hard code to have 3 characters each
        merge the Strings together
        ex:
           abc
           xyz

           output: axbycz

         */
        String input1 = "abc";
        String input2 = "xyz";
        char a = input1.charAt(0);
        char b = input1.charAt(1);
        char c = input1.charAt(2);
        char x = input2.charAt(0);
        char y = input2.charAt(1);
        char z = input2.charAt(2);

        System.out.println("Merged number: " + a + x + b + y + c + z);
    }
}
   /* saim's code
    String a = "abc";
        String b = "XYZ";
        String merged = "";
        merged += a.charAt(0); // merged = merged + a.charAt(0)
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);
        System.out.println(merged);
    */