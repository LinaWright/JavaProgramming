package day43_custome_classes;

public class ThisKeyword {
    int a = 100;
    public ThisKeyword(int a){
        a = 400;
        System.out.println(a); //local variable a
        this.a = 600; // instance variable a
    }
}
