package day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        // // this is a valid do while where the boolean is true, for the first 10 numbers. We see 0 - 10
        int a=0;
        do{
            // everything between the curly brackets are in the loop
            System.out.println(a);
            a++;
        }while(a<10);
//this loop has boolean of false, but it still runs through the code body one time because it is do while
        System.out.println("With false boolean");
        int b =0;
        do{
            // everything between the curly brackets are in the loop
            System.out.println(b);
            b++;
        }while(b == 10);

        //this is a while loop that is the same as the do while above, but nothing will print from this one because it is false, the loop never starts
        System.out.println("as while loop");
        int c=0;
        while(c==10){
            System.out.println(c);
        }
    }
}
