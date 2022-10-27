package day52_inheritance.season;

public class Summer extends Season{
    public Summer(String name, double highestTem, double lowestTem){
        super(name, highestTem, lowestTem);
    }

    @Override
    public void activity(){
        System.out.println("Drink Lemonade");
    }
}

/*
Create a class Summer

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Drink Lemonade
 */