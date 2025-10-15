public class fraction{
    private int numirator;
    private int denomirator;

    fraction(){
        numirator=1;
        denomirator=0;

    }fraction(int n, int d){
        numirator=n;
        denomirator=d;

    }public void set_nomirator(int n){
        numirator=n;
        
    }public void set_denomirator(int d){
        denomirator=d;

    }public int get_nomirator(){
        return numirator;

    }public int get_denomirator(){
        return denomirator;

    }
    public void display(){
        System.out.println(numirator+"/"+denomirator);

    }
    public boolean equals(fraction f){
        return (numirator * f.denomirator == denomirator * f.numirator);

    }

}