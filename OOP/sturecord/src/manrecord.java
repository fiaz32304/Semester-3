public class manrecord {
    private String tittle;
    private double dues;
    private emprecord emp;
    private sturecord stu;

    public manrecord(String tit,double due, emprecord e,sturecord s){
        tittle=tit;
        dues=due;
        emp=e;
        stu=s;
    }
    public void display(){
        System.out.println("the title is::"+tittle);
        System.out.println("the dues  are::"+dues);
        System.out.println("the employe id is::"+emp.getemp_id());
        System.out.println("the employe salary::"+emp.getsalarry());
        System.out.println("the student degree::"+stu.getdegree());
        
    }


    
}
