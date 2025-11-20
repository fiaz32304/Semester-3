public class student1{
    public String name;
    public int age;

    student1(){
       this("Unknown", 0);
    }

    student1(String n){
        this(n,0);
        name=n;
        
    }
    student1(String n, int a){
        name=n;
        age=a;

    }
    public void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}