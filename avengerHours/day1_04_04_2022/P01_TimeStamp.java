package day1_04_04_2022;

public class P01_TimeStamp {
    public static void main(String[] args) {
        String date = "10/10/2022 14:59:00"; // a new obj created in str pool
        date = date.replace("/", ""); // a new obj created in str pool
        System.out.println("1--> " + date);
        date = date.replace(" ", ""); // a new obj created in str pool
        System.out.println("2--> " + date);
        date = date.replace(":", ""); // a new obj created in str pool
        System.out.println("3--> " + date);

        System.out.println(timeStamp("10/10/2022 14:59:00")); //from String return type

        timeStampWithVoid("10/10/2022 14:59:00");
    }

    public static String timeStamp(String dateFromUI) {
        dateFromUI = dateFromUI.replace("/", "").replace(" ", "").replace(":", "");
        return dateFromUI;
    }
    public static void timeStampWithVoid(String date){
        date = date.replace("/", "").replace(" ", "").replace(":", "");
        System.out.println("from void method-->"+date);
    }
}
/*
 Write a method that accepts a String (date with time) and creates a timeStamp for your automation report

         String date= "10/10/2022 14:59:00";
          timeStamp(date); // 10102020145900
 */