import java.util.*;
public class Doctor{
    private String name;
    private List<Patient> patients=new ArrayList<>();

    Doctor(String name){
        this.name=name;

    }public String getname(){
        return name;
    }
    public void addpatient(Patient p){
        patients.add(p);
    }
    public List<Patient> getpatients(){
        return patients;
    }public String tostring(){
        return("Doctor Name: "+name);
        return("Patients:");
        for(Patient p:patients){
            return("- "+p.getname());
        }
        
    }
}