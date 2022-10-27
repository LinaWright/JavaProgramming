package day57_exceptions.webelement;

public class Runner {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("What is Java");

        System.out.println();
        Input input = new Input();
        input.click();
        input.getText();
        input.sendKeys("What is Selenium");
    }
}
  /*
  create a runner class to create objects of Link and Input with a focus on the interface references
   */