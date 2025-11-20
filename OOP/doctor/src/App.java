public class App {
    public static void main(String[] args) throws Exception {
        Doctor d1=new Doctor("Fiaz Ahmad");
        Doctor d2=new Doctor("Samiullah");

        Patient p1=new Patient("hassanin",23);
        Patient p2=new Patient("Ali",13);
        Patient p3=new Patient("Owais",34);
        System.out.println(p1);
        d1.addpatient(p1);
        d1.addpatient(p2);
        d1.addpatient(p3);

        d2.addpatient(p1);
        p1.adddoctor(d1);
        p1.adddoctor(d2);

        d1.showdetails();
        d2.showdetails(); 
        p1.showdetails();
        

    }
}
