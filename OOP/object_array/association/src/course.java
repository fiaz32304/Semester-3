public class course {
    private String coursename;
    private faculty teacher;
    private student [] stulist;

    course(String coursename,faculty teacher){
        this.coursename=coursename;
        this.teacher=teacher;


    }  
    public void set_student_list(student [] s){
        stulist=s;
    }
    public String get_coursename(){
        return coursename;

    }
    public void show_student_class(){
        for(student s:stulist){
            System.out.println(s.get_stuname());

        }


    }
}
