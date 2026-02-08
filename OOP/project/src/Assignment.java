public class Assignment {

    private int assignmentID;
    private String title;
    private String description;

    public Assignment(int id, String title, String desc) {
        this.assignmentID = id;
        this.title = title;
        this.description = desc;
    }

    public int getAssignmentID() {
        return assignmentID;
    }
}
