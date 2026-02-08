public class Enrollment {

    private int enrollmentId;
    private Student student;
    private Course course;

    public Enrollment(Student s, Course c) {
        this.student = s;
        this.course = c;
    }

    // Added constructor with enrollment ID
    public Enrollment(int id, Student s, Course c) {
        this.enrollmentId = id;
        this.student = s;
        this.course = c;
    }

    public Course getCourse() {
        return course;
    }
    
    public int getEnrollmentId() {
        return enrollmentId;
    }
}