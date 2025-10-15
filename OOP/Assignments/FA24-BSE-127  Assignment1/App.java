public class App {
    public static void main(String[] args) throws Exception {
        employe e1=new employe("Fiaz ", 123,50000);
        e1.set_salary(80000);

        employe e2=new employe("Ahmad", 127,60000);


        employe e3=new employe("sami ullah", 070,40000);
        e1.displayinfo();
        e2.displayinfo();
        e3.displayinfo();
        employe.display_comp_name();


    }
}
