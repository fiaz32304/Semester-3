public class App {
    public static void main(String[] args) throws Exception {
        account a1=new account();
        a1.deposit(5000);
        a1.withdraw(2000);

        account a2=new account(a1.get_balance());
        a2.deposit(1000);
        a2.withdraw(3000);      
        
        
    }
}
