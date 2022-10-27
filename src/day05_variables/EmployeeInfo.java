package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "Lina";
        String lastName = "Wright";
        char gender = 'F';
        int age = 28;
        boolean isFullTime = true;
        String jobTitle = "GM";
        double salary = 100000;
        int numberOfPTO = 14;
        boolean married = true;
        char suite = 'A';
        System.out.println("My name is " + firstName + " " + lastName + " I'm " + age + "years old and I'm " +gender +
                "\nMy job title is " + jobTitle + " and I'm full time worker which is " + isFullTime + " I make " + salary + " and I have " + numberOfPTO + " days for PTO," +
                " I'm married which is " + married + " I work at suite " + suite);

    }
}
