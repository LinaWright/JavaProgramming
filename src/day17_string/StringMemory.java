package day17_string;

public class StringMemory {
    public static void main(String[] args) {
        String first = "java"; //string literal, in String pool
        String second = new String("java"); //String object, not in String pool, but directly in the heap
        System.out.println(first == second); //false
        //== with String types gives you false. The == doesn't compare the characters, it compares the memory location of the object

        String third = "java";
        System.out.println(first == third); //true they are the same object

        String fourth = "Java"; //at this line, how much object in the string pool: 2
        // you have "java" "Java"
        System.out.println(first = fourth); //false

        String fifth = new String("java");
    }
}
