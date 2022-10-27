package day53_abstraction.person;

public class TestMethod {
    public static void main(String[] args) {
        Tester employee1 = new Tester("STED",1200000);
        employee1.work();
        System.out.println(employee1);
    }
}
