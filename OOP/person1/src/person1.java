import java.util.*;
public class person1{
    public String name;
    public String address;
    private int id;
    List <account> accountholder;

    
    person1(String n, String ad,int id){
        this.name=n;
        this.address=ad;
        this.id=id;
        List <account> accountholder=new ArrayList<>();
    }public void add_person(account p){
        accountholder.add(p);
    }
    
    public int getid(){
        return id;
        
    }
    
    
    public void dislay(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("ID: "+id);
    }
}