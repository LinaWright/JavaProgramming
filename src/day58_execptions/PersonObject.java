package day58_execptions;

public class PersonObject {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setAge(-50);

        try {
            obj.setName("James Bond");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(obj.getName());
        System.out.println(obj.getAge());


    }
}
