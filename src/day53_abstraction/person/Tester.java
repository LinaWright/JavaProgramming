package day53_abstraction.person;

public class Tester extends Employee{
    public Tester (String jobTitle, int salary){
        super(jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Running test");
    }

    @Override
    public void hobby() {
        System.out.println("I like to travel");
    }

    }

