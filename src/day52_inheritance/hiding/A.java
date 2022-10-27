package day52_inheritance.hiding;

public class A {
    public void instanceMethodA(){
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("static method from the PARENT class");
    }
}
