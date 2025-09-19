



public class corsegrade{
    public String student_name;
    public String course_name;
    public String grade;
    public void corsegrade(String s,String c,String g){
        student_name=s;
        course_name=c;
        grade=g;
    }
    public void show_display(){
        System.out.println(student_name);
        System.out.println(course_name);
        System.out.println(grade);

    }
}