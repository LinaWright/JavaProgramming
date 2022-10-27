package day51_inheritance.device;

public class UseDevice {
//TV is a Device, Phone is a Device
public static void main(String[] args) {
    TV TV1 = new TV();
    System.out.println(TV1);
    TV1.useDevice();

    Phone phone1 = new Phone("Apple","X", 1200, true);
    System.out.println(phone1);
    phone1.useDevice();
}
}
/*
Create a class UseDevice

	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes
 */