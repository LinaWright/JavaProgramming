package day18_string;

public class RecapMethod {
    public static void main(String[] args) {

        String s= "pen"; //String pool
        String s2 = new String("pen"); //heap
        System.out.println("Compare with == " + (s == s2)); //false, because they are deferment objects in different memory
        System.out.println("Compare with == " + (s.equals(s2))); //ture, it's checking the value if they have same character

        System.out.println(s.equals("Pen"));// false, case sensitive
        System.out.println(s.equalsIgnoreCase("Pen")); //true

        boolean isSame =s.equalsIgnoreCase(("PEN"));
        if(s.equals("pen")){}

        int len = s.length();
        System.out.println(len);

        //int a= 9;
        //a.length() -> invalid
        //a.equals() -> invalid


        if(s.length()>4){
            System.out.println("long word");
        }else{
            System.out.println("short word");
        }
    }
}
