package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {
        short numberOne = 40;
        float numberTwo = numberOne; //short is smaller than float type so np casting is needed
        System.out.println(numberOne);
        System.out.println(numberTwo);

        float numberThree = 100.5F;
        short numberFour = (short)numberThree; //float is bigger, so we need to cast down to short

        System.out.println(numberThree);
        System.out.println(numberFour); //there is data loss

        float numberFive = 300; //300 is int by default, so it automatically goes up to float
        //We don't have to use float numberFive = 300F, because it's integer number
        System.out.println(numberFive);

        byte numberSix = (byte)numberFive;
        System.out.println(numberSix); //because byte can not hold 300, so it caused data loss

        char letter = 'A';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);

        //This is also a way to cast
        System.out.println((int)letter); //65
        System.out.println((char) 66); //B
    }
}
