package day36_methods;

public class OverloadAndReturn {
    public static void method(){
        System.out.println("default empty method");
    }
    //trying to overload by changing the return type
//    public static void method(){
//
//    }
    //This is not valid, changing the return type does not overload
    public static int method(int a){
        return 0;
    }

}
