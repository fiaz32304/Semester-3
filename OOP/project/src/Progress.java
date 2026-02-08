import java.util.HashMap;
import java.util.Map;

public class Progress {

    private int progressId;
    private Student student;
    private Course course;

    private Map<Integer, Integer> assignmentScores = new HashMap<>();
    private Map<Integer, Integer> quizScores = new HashMap<>();

    public Progress(Student s, Course c) {
        this.student = s;
        this.course = c;
    }

    // Added constructor with progress ID
    public Progress(int id, Student s, Course c) {
        this.progressId = id;
        this.student = s;
        this.course = c;
    }

    public void addAssignmentScore(Assignment a, int marks) {
        assignmentScores.put(a.getAssignmentID(), marks);
    }

    public void addQuizScore(Quiz q, int marks) {
        quizScores.put(q.getQuizID(), marks);
    }

    // Added missing method
    public void addQuizScore(Quiz q) {
        // Adding quiz score without marks (using default value)
        quizScores.put(q.getQuizID(), 0);
    }

    // Added missing method
    public void completeLesson(Lesson lesson) {
        System.out.println("Lesson " + lesson.getLessonID() + " marked as completed for student " + student.getName());
    }

    // Added missing method with corrected name
    public void displayProgress() {
        showProgress();
    }

    public void showProgress() {

        System.out.println("\n--- PROGRESS REPORT ---");

        if (assignmentScores.isEmpty() && quizScores.isEmpty()) {
            System.out.println("No marks available yet");
            return;
        }

        for (Integer aId : assignmentScores.keySet()) {
            System.out.println("Assignment " + aId +
                    " Marks: " + assignmentScores.get(aId));
        }

        for (Integer qId : quizScores.keySet()) {
            System.out.println("Quiz " + qId +
                    " Marks: " + quizScores.get(qId));
        }
    }
}