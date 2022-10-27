package homework_practices;

public class HWGradeBook {
    public static void main(String[] args) {
        String[] name = {"James Bond","Shane Bright","Sofie Brown"};
        int[] score = {85,70,63};
        char[] grade = new char[3];
        for (int i = 0; i < name.length; i++) {
            if (score[i]>=85) {
                grade[i]='A';
            }else if(score[i]>=75){
                grade[i]='B';
            }else if(score[i]>=65){
                grade[i]='C';
            }else {
                grade[i]='D';
            }

            System.out.println("Name of the student: " + name[i] + "\nScore: " + score[i] + "\ngrade: " + grade[i]);
        }

    }
}
    /*
    Gradebook
    Declare three arrays:
    1. String array which will hold names for the students (give values)
    2. Int array which has the score of the student got in the quiz (give values)
    3. Char array which will have some letter grade based on the score (empty)
    4. Output the gradebook at the end with all the information
    Grade scale:
    Above 85: A
    Above 75: B
    Above 65: C
    Other: D
    Challenge: Accept all the
    information with Scanner

    Example:
    Names = [“Mike”, “Joe”, “Ana”, “Ali”, “Joanna”]
    Scores = [80, 54, 100, 66, 94]
    Grades= [‘B’, ‘D’, ‘A’, ‘C’, ‘A’] -> Need to find and store these based on score
    Output:
    Mike | 80 | B
    Joe | 54 | D
    Ana | 100 | A
    Ali | 66 | C
    Joanna | 94 | A
     */