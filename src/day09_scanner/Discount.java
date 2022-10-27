package day09_scanner;

public class Discount {
    public static void main(String[] args) {
         /*
        Task
            declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions

     */
        boolean isItWeekend = true;
        boolean areYouATeacher = true;
        boolean areYouAPoliceOfficer = false;
        boolean areYouAFirefighter = false;
        boolean doYouGetTheDiscount = isItWeekend && (areYouAFirefighter || areYouAPoliceOfficer || areYouATeacher);
        System.out.println(doYouGetTheDiscount);


    }

}
