public class loan{
    private int anualrate;
    private int numyear;
    private int loanamt;
    private int date;
  
    loan(int anual,int num,int l,int d){
        anualrate=anual;
        numyear=num;
        loanamt=l;
        date=d;

    }
    public void display(){
        System.out.println("Anual Rate: "+anualrate);
        System.out.println("Number of Years: "+numyear);
        System.out.println("Loan Amount: "+loanamt);
        System.out.println("Date: "+date);

    }
    public void setanualrate(int a){
        anualrate=a;

    }public int getanualrate(){
        return anualrate;

    }
    public void setnumyear(int n){
        numyear=n;

    }
    public int getnumyear(){
        return numyear;

    }
    public void setloanamt(int l){
        loanamt=l;

    }
    public int getloanamt(){
        return loanamt;

    }
    public void setdate(int date){
        this.date=date;


    }public int getdate(){
        return date;

    }
    public int getmonthlypayment(){
        int monthlypayment=(loanamt+(loanamt*anualrate/100))/numyear/12;
        return monthlypayment;

    }
    public int totalpayment(){
        int totalpayment=(loanamt+(loanamt*anualrate/100));
        return totalpayment;
    }
}