public class Basepluscommisionemploye extends commissionemploye{
    private double baseSalary;

    Basepluscommisionemploye(String first,
                             String last,
                             String SSN,
                             double sales,
                             double rate,
                             double base){
        super(first,last,SSN,sales,rate);
        baseSalary=base;
    }public void setbasesalary(double basesalary){
        basesalary=basesalary;
    }public double getbasesalary(){
        return baseSalary;
    }
    public double earnings(){
        return baseSalary + super.earnings();
    }
}  

