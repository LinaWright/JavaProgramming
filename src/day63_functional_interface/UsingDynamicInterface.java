package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        DynamicInterface<String>printEachChar = (str) -> {
            for(int i = 0; i<str.length(); i++){
                System.out.println(str.charAt(i));
            }
        };
        printEachChar.test("Hello");

        DynamicInterface<Integer>printerNumber5Times = n->{
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
        };
        printerNumber5Times.test(10);
    }
}
