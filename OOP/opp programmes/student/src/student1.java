public class student1{
  public String name;
  public String gender;
  public int marks;
  public int rollno;
  
  student1(String n, String g, int m,int r){
    name=n;
    gender=g;
    marks=m;
    rollno=r;
  }
    public void display(){
        System.out.println("the name is::"+name);
        System.out.println("the gender is::"+gender);
        System.out.println("the marks are::"+marks);
        System.out.println("the name is::"+rollno);

    }
}