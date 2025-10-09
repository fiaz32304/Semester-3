public class App {
    public static void main(String[] args) throws Exception {
        faculty f1=new faculty ("ali", "PHD");

        course [] c=new course[2];
        c[0]=new course("opp",f1);
        c[0]=new course("pf",f1);

        f1.set_course_list(c);
        f1.view_teacher();

        student [] s= new student[3];
        s[0]= new student("abc", "fa24-bse000", c);
        s[1]= new student("xyz", "fa24-bse001", c);
        s[2]= new student("rrrrrr", "fa24-bse003", c);


        s[0].display_stu();

        c[0].set_student_list(s);
        c[0].show_student_class();


    }
}
