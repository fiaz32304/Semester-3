import java.util.*;
public class person{
    private String teachername;
    private List<subject> subjects=new ArrayList<>();
    person(String teachername){
        this.teachername=teachername;
    }
    public String getteachername(){
        return teachername;
    }
    public void addsubject(subject sub){
        subjects.add(sub);


    }
}
