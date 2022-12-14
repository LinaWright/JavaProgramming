package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {
        String s= "jave is a language";
        s=s.replace('a','e');
        System.out.println(s);

        String day = "Today is monday, It's monday, We love monday";//change all the monday to tuesday
        day = day.replace("monday","tuesday");
        System.out.println(day);

        String str = "Today is monday, It's monday, We love monday"; //only change the first monday to tuesday
        System.out.println(str.replaceFirst("monday","tuesday"));

        String target = "Today is monday, It's monday, We love monday"; //only change the second monday to tuesday
        int firstIndex = target.indexOf(',');
        int secondIndex = target.lastIndexOf(',');
        String middleStr = target.substring(firstIndex, secondIndex);
        middleStr = middleStr.replace("monday","tuesday");

        System.out.println(target.substring(0,firstIndex) + middleStr + target.substring(secondIndex));
    }
}
