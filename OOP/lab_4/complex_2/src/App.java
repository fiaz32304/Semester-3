public class App {
    public static void main(String[] args) throws Exception {
        complex_2 c1=new complex_2(11.2,12.2);
        complex_2 c2=new complex_2(2.2,3.3);
        complex_2 c3=new complex_2();
        c3=c1.add(c2);
        c3.display();
        
    }
}
