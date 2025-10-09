public class faculty{
    private String name;
    private String qualification;
    private course [] course_list;

    faculty(String name, String qualification){
        this.name=name;
        this.qualification=qualification;

    }
    public void set_course_list(course [] courselist){
         course_list=courselist;


    }
    public void view_teacher(){
        System.out.println("teacher name::"+name);
        System.out.println("teacher qualification::"+qualification);
        System.out.println("list of courses is:");
        for( course  a:course_list)
        {
            System.out.println(a.get_coursename());
        }
    }
     
}