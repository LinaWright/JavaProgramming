package homework_practices.canvas;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingCanvas {
    public static void main(String[] args) {
        Canvas javaCourse = new Canvas("Java");

        Quiz variables = new Quiz("variables",10,10);
        javaCourse.quizzes.add(variables);


        javaCourse.quizzes.add(new Quiz("if statement", 8,12));

        File day1Notes = new File("day1Notes",1.2);
        File day2Notes = new File("day2Notes",2.2);

        ArrayList<File>files = new ArrayList<>();
        files.add(day1Notes);
        files.add(day2Notes);

        Module day1Module = new Module(files);
        javaCourse.modules.add(day1Module);

        javaCourse.modules.add(
                new Module(new ArrayList<>(Arrays.asList(
                        new File("day 2 notes", 1.5),
                        new File("day 2 recap pdf", 2.4)
                ))
        ));

        System.out.println(javaCourse);

    }
}
