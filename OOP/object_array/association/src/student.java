public class student{
    private String name;
    private String reg_no;
    course [ ] course_list;

    student(String name, String reg_no,course [] course_list){
        this.name=name;
        this.reg_no=reg_no;
        this.course_list=course_list;
        
    }
    public void display_stu(){
        System.out.println("the name of student is::"+name);
        System.out.println("the reg no of student is::"+reg_no);
        for(course c:course_list){
            System.out.println("the courses are::"+c.get_coursename());
        }
    }
    public String get_stuname(){
        return name;
    }
}