public class basecommonemploye extends comemploye{
private double salary;

basecommonemploye(){
    salary=34000;

}basecommonemploye(String fn,String ln,String SS,double gsales,double crate,double s ){
    super(fn,ln,SS,gsales,crate);
    salary=s;

}
public double earning(){
    return super.earning()+salary;
    
 }
 public void display(){
    super.display();
    System.out.println("salary is::"+salary);
    
 }
}
