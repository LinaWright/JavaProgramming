package day09_scanner;

public class GoForAWalk {
    public static void main(String[] args) {
        // We want to go for a walk

        // We will go for a walk if it is not raining and the weather is above 70

        // There is no need to check the weather if it is raining

        boolean isRaining = false;
        int temperature = 60;

        System.out.println(!isRaining && temperature > 70);

    }
}
