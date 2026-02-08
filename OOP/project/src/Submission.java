public class Submission {

    private Student student;
    private Assignment assignment;
    private String content;
    private int marks;

    public Submission(Student s, Assignment a, String content) {
        this.student = s;
        this.assignment = a;
        this.content = content;
    }

    public void setMarks(int m) {
        this.marks = m;
    }
}
