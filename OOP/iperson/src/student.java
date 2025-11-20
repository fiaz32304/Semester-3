
import java.util.*;

public class student extends iperson{
    public String reg;
    ArrayList<student>marks=new ArrayList<>();
    student(String name,String subject,String reg){
        super(name,subject);
        this.reg=reg;
    }
    public void display(){
        super.display();
        System.out.println("reg is"+reg);

   }public void addmarks(student mark){
        marks.add(mark);
   }

}