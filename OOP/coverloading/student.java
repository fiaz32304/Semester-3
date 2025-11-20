public class student{
    public String name;
    public int age;


    student(){
        name="unknown";
        age=0;

    }
    student(String n){
        name=n;
        age=0;

    }
    student(String n,int a){
        name=n;
        age=a;
    }
    public void display(){
        System.out.println("name is"+name);
        System.out.println("age is"+age);
    }

}