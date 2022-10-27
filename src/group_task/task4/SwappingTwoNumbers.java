package group_task.task4;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        //Using a third variable to swap the value
        int x = 5;
        int y = 10;
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("----------------------------------------");
        //Using math
        int a = 5;
        int b = 10;
        int c = a + b; //15
        a = c - a; //10
        b = c - a; //5
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
