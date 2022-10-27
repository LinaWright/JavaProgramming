package office_hour.day07_03_08_2022;

public class P01ForLoopIntro {
    public static void main(String[] args) {

        /*

            for(init;condition;frequency of iteration){

            // statements

            if(){

                    if(){

                        switch(){

                        }

                    }


            }


            init ---> int i=0    (i-j-k)    double - float - short - byte

            condition  --> true / false    i < 5


            iteration --> inc / dec     i++, i--    i+=2 i+=10 ........

            }

         */


        String word = "Cydeo School";

        // C y d e o

        // 0 1 2 3 4


        String result = word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) + " " + word.charAt(4);
        System.out.println(result);


        for (int i = 0; i < word.length(); i++) {

            System.out.print(word.charAt(i) + " ");

        }
        System.out.println("Hello B26");


        System.out.println("====== with variable ========= ");

        result = "";

        for (int i = 0; i < word.length(); i++) {

            result += word.charAt(i) + " ";

        }

        System.out.println(result);

        System.out.println("======= Reverse =========");
        for (int i = word.length() - 1; i > 0; i--) {
            System.out.print(word.charAt(i));
        }
        //word.length()for -->will give you option to creat for loops
        System.out.println("========= Print out only Cydeo ============");

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                break;
            }
            System.out.print(word.charAt(i));
        }
        System.out.println("==========Print out word without space=========");
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                continue;//skip the rest of the part
            }
            System.out.print(word.charAt(i));
        }


    }
}

