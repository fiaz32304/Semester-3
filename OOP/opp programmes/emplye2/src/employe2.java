public class employe2{
   private String name;
   private int age;
   private int salary;
   private String designation;
   
   employe2(String n,int a,int s, String d){
    name=n;
    age=a;
    salary=s;
    designation=d;
   }
   public void display(){
    System.out.println("the name is ::"+name);
    System.out.println("the age is ::"+age);
    System.out.println("the salary is ::"+salary);
    System.out.println("the designamtion is ::"+age);
    

   }
   public void setsalary(int sal){
      salary=sal;

   }
   public int getsalary(){
      return salary;
   }

}