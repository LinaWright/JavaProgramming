package homework_practices.canvas;

public class Quiz {
    String topic;
    int totalNumberOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.totalPoints = totalPoints;
    }

    public void takeQuiz(){
        System.out.println("Taking the " + topic + " quiz");
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", totalNumberOfQuestions=" + totalNumberOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
