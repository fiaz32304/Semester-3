public class bank2{
    public String acname;
    public String acnum;
    public int balance=0;

    bank2(String n,String num, int bal){
        acname=n;
        acnum=num;
        balance=bal;
    }
    public void deposit(int amt){
        balance=balance+amt;
        System.out.println("cash deposit::a"+amt);
        System.out.println("the balance is::"+balance);

    }
    public void withdraw(int amt){
        if(amt<=balance){
            balance=balance-amt;
            System.out.println("cash withdraw::"+amt);
            System.out.println("the balance is::"+balance);
            
        }
        else{
            System.out.println("insufficient balance");
        }
            
        }
        public void display(){
            System.out.println("Account name:"+acname);
            System.out.println("Account number:"+acnum);
            System.out.println("Account balance:"+balance); 

    }
}