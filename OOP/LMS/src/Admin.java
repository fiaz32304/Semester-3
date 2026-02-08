import java.util.*;
class Admin extends user {
private List<Teacher> teachers;
private List<Course> courses;


public Admin(int id, String name) {
super(id, name, "ADMIN");
teachers = new ArrayList<>();
courses = new ArrayList<>();
}


public void createTeacher(int id, String name) {
teachers.add(new Teacher(id, name));
System.out.println("Teacher created successfully");
}


public void createCourse(int id, String title) {
courses.add(new Course(id, title));
System.out.println("Course created successfully");
}


public List<Teacher> getTeachers() { return teachers; }
public List<Course> getCourses() { return courses; }


@Override
public void showMenu() {
System.out.println("--- ADMIN PANEL ---");
}
}