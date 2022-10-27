package day26_Nested_Loop;

public class Month {
    public static void main(String[] args) {
        /*loop inside of a loop
        Go through a whole month by going through each week and each day
         */
        for(int week = 1; week<=4; week++){ //outer loop: first loop that has another loop inside it
            System.out.println("Week " + week);
            for(int day = 1; day<=7; day++){ //inner loop inside of another one
                System.out.println("\tDay: " + day);
            }

        }
    }
}
