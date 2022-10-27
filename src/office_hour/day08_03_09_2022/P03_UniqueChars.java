package office_hour.day08_03_09_2022;

public class P03_UniqueChars {
    public static void main(String[] args) {

        /*
        Task 06: Unique Characters

            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String
         */

        // Manually

        String str="aabdfccfsf";
        //          012345678


        System.out.println(str.indexOf("f"));
        System.out.println(str.lastIndexOf("f"));

        // Dynamic

        for (int i = 0; i < str.length(); i++) {

            char each=str.charAt(i);

            int a=str.indexOf(each);

            int b=str.lastIndexOf(each);

            boolean isUnique=a==b;

            if(isUnique){
                System.out.print(each);
            }

        }

    }

}
