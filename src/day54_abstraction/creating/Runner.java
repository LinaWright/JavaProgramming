package day54_abstraction.creating;

import day54_abstraction.language.Language;

public class Runner {
    public static void main(String[] args) {
      //  Creat obj = new Create(); cannot make objects of interfaces
        Book obj = new Book();// Book is a normal (non - abstract) class
        obj.read();
        obj.write();

        System.out.println(Language.Planet);
    }
}
