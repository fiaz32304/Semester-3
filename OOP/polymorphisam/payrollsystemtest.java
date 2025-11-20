public class payrollsystemtest {
    public static void main(String[] args) {
        Employee emp1=new Salriedemployee("john","doe","111-11-1111",800.00);
        Employee emp2=new commissionemploye("jane","doe","222-22-2222",10000.00,0.06);
        Employee emp3=new Hourly("jim","beam","333-33-3333",20.00,45);
        
        System.out.println("Employee 1: \n"+emp1.toString()+"\nEarnings: $"+emp1.earnings()+"\n");
        System.out.println("Employee 2: \n"+emp2.toString()+"\nEarnings: $"+emp2.earnings()+"\n");
        System.out.println("Employee 3: \n"+emp3.toString()+"\nEarnings: $"+emp3.earnings()+"\n");
        
    }
    
}
