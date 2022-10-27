package day52_inheritance.season;

public class Season {
    String name;
    double highestTem;
    double lowestTem;

    public Season(String name, double highestTem, double lowestTem) {
        this.name = name;
        this.highestTem = highestTem;
        this.lowestTem = lowestTem;
    }

    public void activity(){
        System.out.println("in " + name + "There are a lot of activities");
    }

    @Override
    public String toString() {
        return "season{" +
                "name='" + name + '\'' +
                ", highestTem=" + highestTem +
                ", lowestTem=" + lowestTem +
                '}';
    }
}
/*
Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes
 */