package day46_static;

public class Main {
    int n=10;
    static int z=20;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.z = 40;
        Main obj2 = new Main();
        obj.n = 5;
        System.out.println(obj2.n + " " + obj2.z);
    }
}
