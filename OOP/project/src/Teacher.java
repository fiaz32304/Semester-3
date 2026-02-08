import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    private List<Course> courses = new ArrayList<>();

    public Teacher(int id, String name, String email, String pass) {
        super(id, name, email, pass);
    }

    @Override
 public void displayRole() {
        System.out.println(getName() + " is a Teacher");
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setTeacher(this);
    }

    public List<Course> getCourses() {
        return courses;
    }
    
    // Simple method to create an assignment
    public Assignment createAssignment(int assignmentId, String title, String description) {
        return new Assignment(assignmentId, title, description);
    }
    
    // Simple method to create a quiz
    public Quiz createQuiz(int quizId, int marks) {
        return new Quiz(quizId, marks);
    }
    
    // Simple method to upload assignment marks
    public void giveAssignmentMarks(Progress progress, Assignment assignment, int marks) {
        progress.addAssignmentScore(assignment, marks);
    }
    
    // Simple method to upload quiz marks
    public void giveQuizMarks(Progress progress, Quiz quiz, int marks) {
        progress.addQuizScore(quiz, marks);
    }
    
    // Simple method to enroll a student in a course
    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        student.enroll(enrollment);
    }
}