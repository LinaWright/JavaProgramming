package day49_inheritance.person;

public class Building {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.name = "James";
        obj.age = 40;
        obj.favoriteHobby = "Spy";
        obj.talk();

        Student student = new Student();
        student.name = "Jay";
        student.age = 30;
        student.favoriteHobby = "drawing";
        student.talk();
        //the above variable and methods were inherited from the Person class

        student.study();
        student.funLevel = 100;

    }
}
