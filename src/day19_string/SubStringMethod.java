package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {
        String str = "sunday";
        //            012345
        System.out.println(str.substring(1)); // unday
        System.out.println(str.substring(3)); // day
        System.out.println("satur" + str.substring(3));

        System.out.println(str.substring(2,4)); //nd
        System.out.println(str.substring(0,6)); //index 6 is just the stopping point, it's not being used
    }
}
