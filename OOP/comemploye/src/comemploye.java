public class comemploye{
    protected String fname;
    protected String lname;
    protected String SSN;
    protected double grosssales;
    protected double commonrate;

    comemploye(){
        fname="Fiaz";
        lname="Ahmad";
        SSN="S003";
        grosssales=123.5;
        commonrate=12.5;
    }
    comemploye(String fn,String ln,String SS,double gsales,double crate){
        fname=fn;
        lname=ln;
        SSN=SS;
        grosssales=gsales;
        commonrate=crate;
    }
    public void setfn(String fn){
        fname=fn;

    }
    public String getfn(){
        return fname;
    }
    public void setln(String ln){
        lname=ln;
    }
    public String getln(){
        return lname;

    }
    public void setSSN(String SS){
        SSN=SS;

    }
    public String getSSN(){
        return SSN;
    }
    public void setgrosssales(double gsales){
        grosssales=gsales;
    }
    public double getgrosssales(){
        return grosssales;
    }
    public void setcommonrate(double crate){
        commonrate=crate;
    }public double commonrate(){
        return commonrate;

    }public double earning(){
        return grosssales*commonrate;
    }
    public void display(){
        System.out.println("first name::"+fname);
        System.out.println("last name::"+lname);
        System.out.println("SSN::"+SSN);
        System.out.println("grosssales::"+grosssales);
        System.out.println("first name::"+fname);
    }
}