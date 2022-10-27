package day52_inheritance.season;

public class Spring extends Season{

    public Spring(String name, double highestTem, double lowestTem) {
        super(name, highestTem, lowestTem);
    }

    @Override
    public void activity() {
        System.out.println("Go outside");
    }
}
/*
Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside
 */