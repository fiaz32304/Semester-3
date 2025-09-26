

public class App {
    public static void main(String[] args) throws Exception {
        bmi c1=new bmi("fiaz ahmad",24,4545.6,2);
        c1.display();
        System.out.println("the bmi is "+c1.calculatebmi());
        System.out.println("the status is "+c1.getstatus());
        System.out.println("the name is"+c1.getname());
        System.out.println("the age is"+c1.getage());
        System.out.println("the weight is"+c1.getweight());
        System.out.println("the height is"+c1.getheight());

       
    }
}
