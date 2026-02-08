import java.util.*;
class Course {
private int id;
private String title;
private List<Lesson> lessons = new ArrayList<>();
private List<Assignment> assignments = new ArrayList<>();
private List<Quiz> quizzes = new ArrayList<>();


public Course(int id, String title) {
this.id = id;
this.title = title;
}


public int getId() { return id; }
public String getTitle() { return title; }


public List<Assignment> getAssignments() { return assignments; }
public List<Quiz> getQuizzes() { return quizzes; }
}


