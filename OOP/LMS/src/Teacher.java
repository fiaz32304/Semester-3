class Teacher extends user {


// create assignment
public void createAssignment(int id, String title) {
assignments.add(new Assignment(id, title));
System.out.println("Assignment created");
}


// create quiz
public void createQuiz(int id, String title) {
quizzes.add(new Quiz(id, title));
System.out.println("Quiz created");
}


// view student assignments
public void viewStudentAssignments() {
for (Assignment a : assignments) {
a.showSubmissions();
}
}


// view student quizzes
public void viewStudentQuizzes() {
for (Quiz q : quizzes) {
q.showSubmissions();
}
}


// upload assignment marks
public void uploadAssignmentMarks(Submission s, int marks) {
s.setMarks(marks);
System.out.println("Assignment marks uploaded");
}


// upload quiz marks
public void uploadQuizMarks(Submission s, int marks) {
s.setMarks(marks);
System.out.println("Quiz marks uploaded");
}


public List<Assignment> getAssignments() { return assignments; }
public List<Quiz> getQuizzes() { return quizzes; }


@Override
public void showMenu() {
System.out.println("1. Create Assignment");
System.out.println("2. Create Quiz");
System.out.println("3. View Student Assignments");
System.out.println("4. View Student Quizzes");
System.out.println("5. Upload Assignment Marks");
System.out.println("6. Upload Quiz Marks");
}
}