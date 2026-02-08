import java.util.ArrayList;
import java.util.List;

public class Lesson {

    private int lessonID;
    private String title;
    private String content;
    private Quiz quiz;
    private List<Assignment> assignments = new ArrayList<>();

    public Lesson(int id, String title, String content) {
        this.lessonID = id;
        this.title = title;
        this.content = content;
    }

    public int getLessonID() { return lessonID; }
    
    public String getTitle() { return title; }

    public void addAssignment(Assignment a) {
        assignments.add(a);
    }

    public void setQuiz(Quiz q) {
        this.quiz = q;
    }

    // Added missing method
    public void addQuiz(Quiz q) {
        this.quiz = q;
    }

    public Quiz getQuiz() { return quiz; }
}