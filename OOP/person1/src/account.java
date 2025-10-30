public class account {
    public String acc_type;
    private double balance;
    public person1 persons;
    account(String name,double balance){
        this.acc_type=name;
        this.balance=balance;

    }public double getbalance(){
        return balance;
    }
    public void display(){
        System.out.println("Account Type: "+acc_type);
        System.out.println("Balance: "+balance);
    }
}
