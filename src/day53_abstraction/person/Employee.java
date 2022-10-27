package day53_abstraction.person;

public abstract class Employee extends Person{
    String jobTitle;
    int salary;

    public Employee(String name, int age) {
        super(name, age);
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
