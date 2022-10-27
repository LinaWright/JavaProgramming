package day46_static;

import day47_encapsulation.access_modifiers.AccessModifier;

public class AccessOutsideOfPackage {

    //different class, different package

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
//        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        //c and z are not accessible outside the class because they were private
        //b and y are not accessible outside the package because they were default (didn't have ant other access modifier), so they can only be accessed in the same package
        //so what is accessible outside a package --> public
    }
}
