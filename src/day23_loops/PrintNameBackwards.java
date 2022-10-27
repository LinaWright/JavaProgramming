package day23_loops;

public class PrintNameBackwards {
    public static void main(String[] args) {
        String name = "azad";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
