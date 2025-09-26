public class App {
    public static void main(String[] args) throws Exception {
        emprecord e=new emprecord();
        e.setemp_id(1);
        e.setsalary(500);
        sturecord s=new sturecord();
        s.setdegree("MBA");
       manrecord m1=new manrecord("manager",5000,e,s);
       m1.display();
        
        


    }
}
