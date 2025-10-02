
import javax.swing.plaf.SliderUI;

public class person{
    public String name;
    public int age;
    public int salary;
    public Boolean marrid;

    public person(String n,int a,int s, Boolean m){
        name=n;
        age=a;
        salary=s;
        marrid=m;

    }public void view_information(){
        System.out.println("name is ::"+name);
        System.out.println("age is ::"+age);
        System.out.println("salary is ::"+salary);
        System.out.println("marrid is ::"+marrid);
    }
}