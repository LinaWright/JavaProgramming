package day58_execptions.pen;

import day58_execptions.pen.InvalidColorException;
import day58_execptions.pen.OutOfInkException;

public class Pen {
    int inkLevel;
    String inkColor;
    String color;

    public void write(){
        if(inkLevel>=10){
            System.out.println("Writing with pen, 10 ink used");
            inkLevel-=10;
        }else {
            throw new OutOfInkException("Not enough ink");
        }


        if(color.equals("black")||inkColor.equals("red")||inkColor.equals("blue")){
            inkColor = color;
        }else{
            try {
                throw new InvalidColorException("Invalid color");
            } catch (InvalidColorException e) {
                e.printStackTrace();
            }
        }
    }

}
