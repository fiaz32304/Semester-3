public class App {
    public static void main(String[] args) throws Exception {
      objectpass p= new objectpass();
      p.value=5;
      System.out.println("before calling::"+p.value);
      objectpass.increment(p); 
      System.out.println("after calling::"+p.value);
    }
}
