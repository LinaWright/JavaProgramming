package day07_unary_operators;

public class Test1Replit {
    public static void main(String[] args) {
        String firstName = "Noah", lastName = "Smith";

        String companyName ="Apple";

        int salary = 200_000;

        int startDay = 10;

        int startMonth = 1;

        int startYear = 2022;

        boolean fullTime = true;

        String jobTitle = "SDET";

        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";


        String fullName = firstName + " " + lastName;

        String fullStartDate = startMonth + "/" +startDay + "/"
                + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";

        int salaryAfter2Years = (int)(salary + (salary * 0.15));

//        Display all the information in the following format using the variables created up to this point:
//        Employee Information
//        We have FULL_NAME joining COMPANY_NAME
//        FIRST_NAME will start on FULL_START_DATE as full time: IS_FULL_TIME
//        FIRST_NAME here is some information about your employment
//        Your email is EMAIL
//        Your base salary is $SALARY and after 2 years it will be $SALARY_2_YEARS
//        Welcome aboard, see you at ADDRESS

        String employeeInformation = "Employee Information" + "\nWe have " + fullName + " joining " + companyName + "\n " + fullName + " will start on "
                + fullStartDate + " as full time: " + fullTime + "\n " + fullName + " here is some information about your employment \nYour email is " +
                email + "\n "+ "Your base salary is $" + salary + " and after 2 years it will be $" + salaryAfter2Years + "\n " + "Welcome aboard, see you at " + officeAddress;
        System.out.println(employeeInformation);

    }
}
