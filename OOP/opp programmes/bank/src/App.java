public class App {
    public static void main(String[] args) throws Exception {
        bank c1=new bank("Alice",1000,1);
        c1.display();
        c1.deposit(500);
        System.out.println("the totral balance is::"+c1.getBalance());

    }
}
