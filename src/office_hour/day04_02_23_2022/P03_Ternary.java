package office_hour.day04_02_23_2022;

public class P03_Ternary {

    public static void main(String[] args) {


        /*

        ? ---  if
        : ---  else

        condition ? true statemnets : false statements

  */


        int a = 15;
        int b = 10;

        System.out.println(a > b ? a : b);

        System.out.println(" ======= SQUARE TASK WITH TERNARY =============");
        int x = 4;
        int y = 4;

        String result = (x == y) ? "Square" : "Rectangle";
        System.out.println("result = " + result);

        System.out.println(" ======= BMI TASK WITH TERNARY =============");

        double mass = 82.4;
        double height = 1.82;
        double BMI = mass / (height * height);

//        if (BMI < 18.5) {
//            result = "Underweight";
//        } else if (BMI >= 18.5 && BMI < 25) {
//            result = "Normal weight";
//        } else if (BMI >= 25 && BMI < 30) {
//            result = "Overweight";
//        } else {
//            result = "Obese";
//        }
        result = (BMI < 18.5) ? "Underweight" : (BMI >= 18.5 && BMI < 25) ? "Normal weight" : (BMI >= 25 && BMI < 30) ? "Overweight" : "Obese";
        System.out.println("result = " + result);


        System.out.println(" ======= donateBlood TASK WITH TERNARY =============");

        int age = 25;
        int weight = 80;


//        if (age >= 18) {
//            // check another condition.
//            if (weight >= 50) {
//                System.out.println("You are eligible to donate blood");
//            } else {
//                System.out.println("You are not eligible to donate blood");
//            }
//        } else {
//            System.out.println("Age must be greater than 18");

        result=(age >= 18)?(weight >= 50)?"You are eligible to donate blood":"You are not eligible to donate blood":"Age must be greater than 18";
        System.out.println("result = " + result);
    }
}




