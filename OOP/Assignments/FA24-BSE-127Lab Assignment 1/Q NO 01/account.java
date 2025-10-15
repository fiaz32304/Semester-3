public class account{
    private double balance;

    account(){
    balance = 0.0;
    }

    account(double balance){
        this.balance = balance;
    }

    public void set_balance(double amounnt){
        balance = amounnt;

    }
    public double get_balance(){
        return balance;
    } 
    public void deposit(double amount){
            balance =balance+ amount;
            System.out.println("Deposited: "+ amount);

        } 
    public void withdraw(double amount){
        if(amount <= balance && amount>0){
            balance = balance - amount;
            System.out.println("Withdrawn: "+ amount);
            System.out.println("Remaining Balance: "+ balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}