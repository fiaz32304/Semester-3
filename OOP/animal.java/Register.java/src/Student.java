public class Student implements Register{
    private String name;
    private int age;
    private int gpa;
    public Student(){
        name=null;
        age=0;
        gpa=0;
    }
     Student(String name, int age, int gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa; 
    }
    public void register(){
        System.out.println("Student is registered");
        System.out.println("name ::"+name);
        System.out.println("age ::"+age);
        System.out.println("gpa ::"+gpa);
    }  


}