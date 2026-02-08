import java.util.*;
class Student extends user {
private Progress progress = new Progress();


public Student(int id, String name) {
super(id, name, "STUDENT");
}


public void uploadAssignment(Teacher t, Scanner sc) {
for (Assignment a : t.getAssignments()) {
System.out.println(a.getTitle());
System.out.print("Upload Assignment Content: ");
String c = sc.nextLine();
a.uploadSubmission(c);
}
}


public void uploadQuiz(Teacher t, Scanner sc) {
for (Quiz q : t.getQuizzes()) {
System.out.println(q.getTitle());
System.out.print("Upload Quiz Content: ");
String c = sc.nextLine();
q.uploadSubmission(c);
}
}


public void viewMarks(Teacher t) {
for (Assignment a : t.getAssignments()) {
if (a.getSubmission() != null)
System.out.println(a.getTitle() + " Marks: " + a.getSubmission().getMarks());
}
for (Quiz q : t.getQuizzes()) {
if (q.getSubmission() != null)
System.out.println(q.getTitle() + " Marks: " + q.getSubmission().getMarks());
}
}


public void viewProgress() {
System.out.println("Completed Lessons: " + progress.getCompletedLessons());
}


@Override
public void displayRole() {
System.out.println("Student Panel");
}
}