import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    private List<Enrollment> enrollments = new ArrayList<>();
    private Progress progress;

    public Student(int id, String name, String email, String pass) {
        super(id, name, email, pass);
    }

    @Override
    public void displayRole() {
        System.out.println(getName() + " is Student");
    }

    // Modified enroll method to accept Enrollment object
    public void enroll(Enrollment e) {
        enrollments.add(e);
        progress = new Progress(e.getEnrollmentId(), this, e.getCourse());
    }

    // Kept original enroll method for backward compatibility
    public void enroll(Course c) {
        Enrollment e = new Enrollment(this, c);
        enrollments.add(e);
        progress = new Progress(this, c);
    }

    public Submission uploadAssignment(Assignment a, String content) {
        return new Submission(this, a, content);
    }

    public void attemptQuiz(Quiz q) {
        System.out.println(getName() + " attempted quiz ID: " + q.getQuizID());
    }

    public Progress getProgress() {
        return progress;
    }
    
    // Simple method to enroll in a course
    public void enrollInCourse(Course course) {
        enroll(course);
        System.out.println("Enrolled in course: " + course.getTitle());
    }
    
    // Simple method to upload an assignment
    public void submitAssignment(Assignment assignment, String content) {
        Submission submission = new Submission(this, assignment, content);
        System.out.println("Assignment submitted: " + assignment.getAssignmentID());
    }
    
    // Simple method to attempt a quiz
    public void takeQuiz(Quiz quiz) {
        System.out.println("Quiz attempted: " + quiz.getQuizID());
        if (progress != null) {
            progress.addQuizScore(quiz, 0); // Default score
        }
    }
    
    // Simple method to view marks
    public void viewMyMarks() {
        if (progress != null) {
            progress.showProgress();
        } else {
            System.out.println("No marks available yet");
        }
    }
    
    // Method to view available courses for enrollment
    public void viewAvailableCourses() {
        List<Course> courses = Course.getAllCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses available for enrollment.");
            return;
        }
        
        System.out.println("\n--- AVAILABLE COURSES ---");
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            System.out.println((i + 1) + ". " + course.getTitle() + " (ID: " + course.getCourseID() + ")");
            System.out.println("   Description: " + course.getDescription());
        }
    }
    
    // Method to enroll in a course by selecting from available courses
    public void enrollInAvailableCourse(int courseIndex) {
        List<Course> courses = Course.getAllCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses available for enrollment.");
            return;
        }
        
        if (courseIndex < 1 || courseIndex > courses.size()) {
            System.out.println("Invalid course selection.");
            return;
        }
        
        Course selectedCourse = courses.get(courseIndex - 1);
        enrollInCourse(selectedCourse);
    }
}