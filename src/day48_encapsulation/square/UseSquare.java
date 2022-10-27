package day48_encapsulation.square;

import day48_encapsulation.square.Square;

public class UseSquare {
    public static void main(String[] args) {
        Square obj = new Square(5);
        System.out.println(obj);

        //obj.side = 11; can't  change the cause like this because it has private access
        obj.setSide(11);
        System.out.println(obj);
    }
}
