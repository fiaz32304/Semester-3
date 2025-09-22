public class App {
    public static void main(String[] args) {
        employe  e1=new employe();
        e1.setname("sachin");
        e1.salary=34000;
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());
        e1.display();
    }
}
