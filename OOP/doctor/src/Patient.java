import java.util.*;
public class Patient{
    private String name;
    private int age;
    private List<Doctor>doctors=new ArrayList<>();
    Patient(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public void adddoctor(Doctor d){
        doctors.add(d);
    }
    public List<Doctor>getdoctor(){
        return doctors;
    }
    public String toString(){
        System.out.println("Patient Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Doctors:");
        for(Doctor d:doctors){
            System.out.println("- "+d.getname());
        }
        return "Complete";
    }

}