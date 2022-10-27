package day52_inheritance.season;

public class Winter extends Season {

    public Winter(String name, double highestTem, double lowestTem) {
        super(name, highestTem, lowestTem);
    }


    @Override
    public void activity(){
        System.out.println("Use fireplace");
    }
}
/*
Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace
 */