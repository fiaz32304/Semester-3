public class employe{
    private String name;
    private int empid;
    private double salary;
    private static String comp_name="TechNova Solutions";

    employe(String name, int empid, double salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
        
    }
    public void displayinfo(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Salary: "+salary);

    }
    public void set_salary(double salary){
        this.salary=salary;

    }
    public double get_salary(){
        return salary;

    }
    public static void display_comp_name(){
        System.out.println("the company name is::"+comp_name);
    }
}