package day48_encapsulation;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length>0){
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if(width>0){
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    double calculateArea(){
        return length * width;
    }

    double calculatePerimeter(){
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}' +
        "\n Calculate Perimeter" + (length + width) * 2;
    }

    /*

    create a class called Rectangle

        - data:

            length, width

        - constructor

            - create a constructor that creates a Rectangle object with the length and the width

            	call setters here

        - encapsulate the Rectangle class

        	- setter condition: length and width must both be a positive number otherwise they will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Rectangle

            - calculatePerimeter()
  				calculate and return the perimeter of a Rectangle

            - toString()
                print the length, width, area, and perimeter of the Rectangle object

    Create a separate class to create and test the Rectangle objects
 */
}
