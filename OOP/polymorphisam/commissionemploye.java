public class commissionemploye extends Employee{
    private double grosssales;
    private double commissionrate;

    commissionemploye(String first,
                      String last,
                      String SSN,
                      double sales,
                      double rate){
        super(first,last,SSN);
        grosssales=sales;
        commissionrate=rate;
    }
    public double earnings(){
        return grosssales*commissionrate;
    }
    
}
