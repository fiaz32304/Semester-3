public class App {
    public static void main(String[] args) throws Exception {
        bank2 c1=new bank2("fiaz","32304",5000);
        c1.display();
        c1.deposit(4000);
        c1.withdraw(200);
        bank2 c2=new bank2("ahmad","23423",6700);
        c1.display();
        c1.deposit(400);
        c1.withdraw(20);
    }
}
