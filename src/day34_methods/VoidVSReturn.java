package day34_methods;

public class VoidVSReturn {
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
       return "Bye";
    }

    public static void main(String[] args) {
        sayHello();
//        String msg = sayHello(); this doesn't work because the method is void
        sayBye(); //This will not print "Bye"
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);

    }


}
