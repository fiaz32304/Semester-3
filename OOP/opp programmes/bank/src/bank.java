public class bank{
    private String account_holder;
    private int balance=0;
    private int id;


    bank(String account_holder, int balance, int id){
        this.account_holder=account_holder;
        this.balance=balance;
        this.id=id;
    }
     public void display(){
        System.out.println("Account Holder: "+account_holder);
        System.out.println("Balance: "+balance);
        System.out.println("ID: "+id);

    }public void deposit(int amount){
        balance=balance+amount;
        System.out.println("Amount Deposited: "+amount);
    }
    public void cash_withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance=balance-amount;
            System.out.println("Amount Withdrawn: "+amount);
        }
    }
    public int getBalance(){
        return balance;
    }
}