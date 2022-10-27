package office_hour.day03_02_22_2022;

public class P01_SmallIfTask {

    //  1-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80

    public static void main(String[] args) {
        int tem = 75;
        String result = " ";
        if (tem >= 70 && tem <= 80) {
            result = "Ideal Temp";
        }
        System.out.println(result);


        // 2-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater than 100
        int a = 0;
        int b = 50;
        int c = 150;

        if (b == 50 && c > 100) {
            a = 20;
        }
        System.out.println(a);

    }
}