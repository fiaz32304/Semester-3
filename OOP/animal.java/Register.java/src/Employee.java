public class Employee implements Register{
    private String name;
    private String date;
    private int salary;

    public Employee(){
        name=null;
        date=null;
        salary= 0;
    }
    public Employee(String name, String date,int salary){
        this.name=name;
        this.date=date;
        this.salary=salary;
        
    }
    public void register(){
        System.out.println("Employe is registered");
        System.out.println("name ::"+name);
        System.out.println("date::"+date);
        System.out.println("Salary::"+salary);
    }

}