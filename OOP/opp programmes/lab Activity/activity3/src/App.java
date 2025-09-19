public class App {
    public static void main(String[] args) throws Exception {
        rectangle r1=new rectangle();
        System.out.println("Area of rectangle is: "+r1.calculatearea());
        rectangle r2=new rectangle();
        r2.rectangle(20,30);
        System.out.println("Area of rectangle is: "+r2.calculatearea());        
    }
}
