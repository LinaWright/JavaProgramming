package day09_scanner;

public class EligibleToCote {
      /*
        create and assign these variables:

            name
            are they citizen
            do have criminal background
            age

        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

     */
      public static void main(String[] args) {
          String name = "Lina Wright";
          boolean isCitizen = false;
          boolean noCriminalBackground = true; //hasCriminalBackground = false;
          int age = 29;
          boolean isEligibleToVote = age>=18 && isCitizen && noCriminalBackground;//!hasCriminalBackground;
          System.out.println("Is Lina eligible for voting " + isEligibleToVote );

      }

}
