public class student extends person {
    private String roll_no;
    private int marks;

    student(){
    super();
    roll_no="FA24-BSE-127";
    marks=450;
    }
    public student(String n,String id,int p,String r,int m){
        super(n,id,p);
        roll_no=r;
        marks=m;
    }
    public void setroll_no(String r){
        roll_no=r;

    }public String getroll_no(){
        return roll_no;

    }public void set_marks(int m){
        marks=m;

    }public int get_marks(){
        return marks;

    }public void display(){
        super.show_display();
        System.out.println("roll_no is::"+roll_no);
        System.out.println("marks are"+marks);
    }


}
    

