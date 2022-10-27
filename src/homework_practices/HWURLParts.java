package homework_practices;

public class HWURLParts {
    public static void main(String[] args) {
String URL = "https://learn.cydeo.com/courses/130";
String[] split = URL.split("/");
        //System.out.println(Arrays.toString(split));
        for (String s: split){//for(dataType variable: Array)
            System.out.println(s);
        }
    }
}
/*
URL Parts

Given a url as follows, print each section of the url separated by the forward slash /

	Example:
		url = https://learn.cydeo.com/courses/130

	output:
		https:

		learn.cydeo.com
		courses
		130
 */