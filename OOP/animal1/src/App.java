public class App {
    public static void main(String[] args) throws Exception {
        animal1 a=new horse();
        animal1 b=new cat();
// upcasting
       // a.sound();
       // b.sound();

// downcasting
        horse h=(horse)a;
        h.onlyhorse();
        h.sound();
        cat c=(cat)b;
        c.onlycat();
        c.sound();
    }
}
