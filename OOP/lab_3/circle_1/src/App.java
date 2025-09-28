public class App {
    public static void main(String[] args) throws Exception {
        circle_1 c1=new circle_1();
        c1.setradius(5);
        System.out.println(c1.getradius());
        c1.display();
        System.out.println("the circumference of c1::"+c1.circumference());
        
    }
}
