package day49_inheritance.company;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "James";
        emp1.isFullTime = true;
        emp1.salary = 200000;
        emp1.work();

        System.out.println();
        Tester emp2 = new Tester();
        emp2.name = "Jim";
        emp2.isFullTime = true;
        emp2.salary = 200000;
        emp2.bugsFound = true;
        emp2.work();
        emp2.test();

        System.out.println();
        Developer emp3 = new Developer();
        emp3.name = "Jim";
        emp3.isFullTime = true;
        emp3.salary = 200000;
        emp3.work();
        emp3.featuresCreated = true;
        emp3.develop();

    }


}
