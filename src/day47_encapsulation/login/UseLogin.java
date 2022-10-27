package day47_encapsulation.login;

import day47_encapsulation.login.Login;

public class UseLogin {
    public static void main(String[] args) {
        Login obj = new Login();
//        obj.userName = "James";
//        obj.password = "1234";
        //cannot access private variables directly
        obj.setUserName("james");
        obj.setPassword("1234");

//        System.out.println(obj.setUserName);
//        System.out.println(obj.setPassword);

        System.out.println(obj.getPassword());
        System.out.println(obj.getUserName());


    }
}
