import java.util.ArrayList;
import java.util.List;

public class Course {

    private static List<Course> allCourses = new ArrayList<>();
    
    private int courseID;
    private String title;
    private String description;
    private Teacher teacher;
    private List<Lesson> lessons = new ArrayList<>();

    public Course(int id, String title, String desc) {
        this.courseID = id;
        this.title = title;
        this.description = desc;
        allCourses.add(this);
    }

    // Added constructor to match usage in MainApp
    public Course(int id, String title, String desc, Teacher teacher) {
        this.courseID = id;
        this.title = title;
        this.description = desc;
        this.teacher = teacher;
        allCourses.add(this);
    }

    public String getTitle() { return title; }
    
    public String getDescription() { return description; }
    
    public int getCourseID() { return courseID; }

    public void setTeacher(Teacher t) {
        this.teacher = t;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void addLesson(Lesson l) {
        lessons.add(l);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
    
    // Static method to get all courses
    public static List<Course> getAllCourses() {
        return new ArrayList<>(allCourses);
    }
    
    // Static method to get course count
    public static int getCourseCount() {
        return allCourses.size();
    }
}