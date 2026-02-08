import java.util.List;
import java.util.ArrayList;

public class Admin extends User {

    public Admin(int id, String name, String email, String pass) {
        super(id, name, email, pass);
    }

    @Override
    public void displayRole() {
        System.out.println(getName() + " is an Admin");
    }

    public void manageUser(User u) {
        System.out.println("Admin managing user: " + u.getName());
    }
    
    // Method to create a new course
    public Course createCourse(int courseId, String title, String description) {
        Course course = new Course(courseId, title, description);
        System.out.println("Admin " + getName() + " created course: " + title);
        return course;
    }
    
    // Method to assign a teacher to a course
    public void assignTeacherToCourse(Course course, Teacher teacher) {
        course.setTeacher(teacher);
        teacher.addCourse(course);
        System.out.println("Admin " + getName() + " assigned teacher " + teacher.getName() + " to course " + course.getTitle());
    }
    
    // Method to add a lesson to a course
    public void addLessonToCourse(Course course, Lesson lesson) {
        course.addLesson(lesson);
        System.out.println("Admin " + getName() + " added lesson " + lesson.getTitle() + " to course " + course.getTitle());
    }
    
    // Method to view all courses
    public void viewAllCourses() {
        List<Course> courses = Course.getAllCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        
        System.out.println("\n--- ALL COURSES ---");
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            System.out.println((i + 1) + ". " + course.getTitle() + " (ID: " + course.getCourseID() + ")");
            System.out.println("   Description: " + course.getDescription());
            if (course.getTeacher() != null) {
                System.out.println("   Teacher: " + course.getTeacher().getName());
            } else {
                System.out.println("   Teacher: Not assigned");
            }
        }
    }
}