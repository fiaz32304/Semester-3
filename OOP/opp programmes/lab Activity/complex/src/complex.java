public class complex{
    private double real;
    private double imag;
    public complex(){
        real=0.0;
        imag=0.0;   
    }
    public complex(double r,double i){
        real=r;
        imag=i;

    }
    public complex add(complex b){
        complex c=new complex(real+b.real,imag+b.imag);
        return c;
    }
    public void show(){
        System.out.println(real+imag);
    }
}