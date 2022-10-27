package day48_encapsulation.square;

public class Square {

    /*
     create a class called Square

        - data:

            side
    */

    private int side;

     /*
        - constructor

            - create a constructor that creates a Square object with the side

            	call setter here

        - encapsulate the Square class

        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable
    */

    public Square(int side) {
        setSide(side);
    } //call setter method, this will make sure that the input follows the if condition in the setter

    public int getSide() { //cannot do obj.side anymore --> obj.getSide
        return side;
    }

    public void setSide(int side) { //cannot do obj.side = value -->obj.setSide(value)
        if(side > 0){
            this.side = side;
        }
    }

    public int calculateArea(){
        return side*side;
    }

    public int calculatePerimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Side of square: " + side +
                "\nArea: " + calculateArea() +
                "\nSquare perimeter is: " + calculatePerimeter();
    }



    /*
        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Square

            - calculatePerimeter()
  				calculate and return the perimeter of a Square

            - toString()
                print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects
     */
}
