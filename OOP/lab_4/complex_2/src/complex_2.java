public class complex_2{
    private double imag;
    private double real;

   public complex_2(){
    imag=0.0;
    real=0.0;

   } complex_2(double i,double r){
    imag=i;
    real=r;

   }public complex_2 add(complex_2 b){

    complex_2 c_new=new complex_2(real+b.real, imag+b.imag);
     return c_new;
   }
   public void display(){
    System.out.println("the imag is::"+imag);
    System.out.println("the real is ::"+real);
   }
}