package day42_customer_classes;

public class UsingApp {
    public static void main(String[] args) {
        App cydeo = new App();
        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;

       // System.out.println(App.run());
        //We cannot cll instance methods like this

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);

        System.out.println(cydeo); //day42_customer_classes.App@edf4efb

        new App().run(); //This creates an object with no reference and calls the run method
        //null is running
    }
}
