public class App {
    public static void main(String[] args) throws Exception {
    basic c1=new basic();
    c1.id= 32;
    c1.name="Fiaz ahmad";
    c1.age=20;
    c1.salary=5600;


    basic c2=new basic();
        c2.id=45;
        c2.name="Ali";
        c2.age=25;
        c2.salary=6000;
    

    // System.out.println("ID: "+c1.id);
    // System.out.println("Name: "+c1.name);
    // System.out.println("Age: "+c1.age);
    c1.display();
    c2.display();
    System.out.println("the salary is ::"+c1.getsalary());
    System.out.println("the salary is ::"+c2.getsalary());
    }
}
