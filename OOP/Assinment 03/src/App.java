public class App {
    public static void main(String[] args) throws Exception {
        fraction f1=new fraction(2,5);
        fraction f2=new fraction(4,10);

        f1.display();
        f2.display();

        if (f1.equals(f2)){
            System.out.println("Fractions are equal.");
        }
        else{
            System.out.println("Fractions are not equal.");
        }
    }
}
