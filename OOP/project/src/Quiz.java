public class Quiz {

    private int quizID;
    private int marks;

    public Quiz(int id) {
        this.quizID = id;
    }

    // Added constructor with marks parameter
    public Quiz(int id, int marks) {
        this.quizID = id;
        this.marks = marks;
    }

    public int getQuizID() {
        return quizID;
    }
    
    public int getMarks() {
        return marks;
    }
}