public class Salriedemployee extends Employee {
    private double weeklysalary;

    Salriedemployee(String first,String last,String SSN,double salary){
        super(first,last,SSN);
        weeklysalary=salary;
        
    }
    public double earnings(){
    return weeklysalary;
    }    
}
