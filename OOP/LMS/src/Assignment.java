public class Assignment {
private String title;
private Submission submission; // student upload


public Assignment(String title) {
this.title = title;
}


public String getTitle() { return title; }


public void uploadSubmission(String content) {
this.submission = new Submission(content);
}


public Submission getSubmission() { return submission; }
}


public String getTitle() { return title; }
public int getMarks() { return marks; }
public void setMarks(int marks) { this.marks = marks; }
}
