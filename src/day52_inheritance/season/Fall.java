package day52_inheritance.season;

public class Fall extends Season{
    public Fall(String name, double highestTem, double lowestTem) {
        super(name, highestTem, lowestTem);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");
    }
}
/*
Create a class Fall

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Read A Book
 */