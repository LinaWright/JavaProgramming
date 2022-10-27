package homework_practices;

public class HTMLGenerator {
    public static void main(String[] args) {
        String str = "div^2";
        String tag = str.substring(0,str.indexOf('^'));
        String num = str.substring(str.indexOf('^')+1);
        int number = Integer.parseInt(num);
        for (int i = 0; i < number; i++) {
            System.out.print("<" + tag + "></" + tag + "> ");
        }
    }
}
/* saim's code
 public static void main(String[] args) {
        System.out.println(htmlGenerate("li^3"));
        System.out.println(htmlGenerate("div^6"));
        System.out.println(htmlGenerate("ul^4"));
    }

    public static String htmlGenerate(String str){

        String html = "";
        String [] parts = str.split("\\^"); // str.replace("^" , " ").split(" ");

        int repeat = Integer.parseInt(parts[1]);

        for(int i = 0; i < repeat; i++){

            html += "<" + parts[0] + "></" + parts[0] + "> ";

        }

        return html;
    }

    // html =   html += "<" + parts[0] + "></" + parts[0] + "> ";
    // html.repeat(3)

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
 */