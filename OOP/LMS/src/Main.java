import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Admin admin = new Admin(1, "Super Admin");
List<Student> students = new ArrayList<>();


int choice;
do {
System.out.println("\n1- Admin\n2- Teacher\n3- Student\n0- Exit");
choice = sc.nextInt(); sc.nextLine();


switch (choice) {
case 1:
int a;
do {
System.out.println("1- Create Teacher\n2- Create Course\n0- Back");
a = sc.nextInt(); sc.nextLine();
if (a == 1) admin.createTeacher(sc);
if (a == 2) admin.createCourse(sc);
} while (a != 0);
break;


case 2:
if (admin.getTeachers().isEmpty()) {
System.out.println("No Teachers Available"); break;
}
Teacher t = admin.getTeachers().get(0);
int tChoice;
do {
System.out.println("1- Create Assignment\n2- Create Quiz\n0- Back");
tChoice = sc.nextInt(); sc.nextLine();
if (tChoice == 1) t.createAssignment(sc);
if (tChoice == 2) t.createQuiz(sc);
} while (tChoice != 0);
break;


case 3:
System.out.print("Student ID: ");
int sid = sc.nextInt(); sc.nextLine();
System.out.print("Student Name: ");
String sname = sc.nextLine();
Student s = new Student(sid, sname);
students.add(s);
int sChoice;
do {
System.out.println("1- Enroll Course\n2- View Marks\n0- Back");
sChoice = sc.nextInt(); sc.nextLine();
if (sChoice == 1) s.enrollCourse(admin.getCourses(), sc);
if (sChoice == 2) s.viewMarks();
} while (sChoice != 0);
break;
}
} while (choice != 0);
}
}