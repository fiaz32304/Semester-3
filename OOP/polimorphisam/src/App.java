public class App {
    public static void main(String[] args) throws Exception {
        polimorphisam d1=new Dog();
        polimorphisam c1=new Cat();

        d1.sound();
        
        c1.sound();
        Dog h1=(Dog) d1;
        d1.sound();
        h1.dogonly();
        Cat h2=(Cat) c1;
        h2.catonly();
        h2.sound();
    }
}
