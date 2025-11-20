public class Hourly extends Employee{
    private double wage;
    private double hours;
    Hourly(String first,
           String last,
           String SSN,
           double hourlywage,
           double hourlyworked){
        super(first,last,SSN);
        wage=hourlywage;
        hours=hourlyworked;

    }public double earning(){
        if(hours<=40){
             return wage*hours;
        }
           
        
        else{
            return 40*wage+(hours-40)*wage*1.5;
        }
            
    }
}
