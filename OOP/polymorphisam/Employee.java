public abstract class Employee{
    private String firstname;
    private String lastname;
    private String socialsecuritynumbr;

    public Employee(String first,String last, String SSN){
        firstname=first;
        lastname=last;
       socialsecuritynumbr=SSN;
    }
    public String toString(){
        return String.format("%s %s\n social security number:: %s",firstname,lastname,socialsecuritynumbr);
    }

    public abstract double earnings();

}