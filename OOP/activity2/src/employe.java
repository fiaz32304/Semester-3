public class employe{
    private String name;
    private String fname;
    private date birthdate;
    private date hiredate;

    
    employe(String x,String y, date birthofdate,date hireofdate){
        name=x;
        fname=y;
        birthdate=birthofdate;
        hiredate=hireofdate;


    }
    public void setname(String x){
        name=x;

    }public String getname(){
        return name;

    }public void setfname(String y){
        fname=y;

    }public String getfname(){
        return fname;
        
    }public void setbirthdate(date b){
        birthdate=b;

    }public date getbirthdate(){
        return birthdate;

    }public void sethiredate(date h ){
        hiredate=h;

    }public date gethiredate(){
        return hiredate;
        

        }
        
        

} 