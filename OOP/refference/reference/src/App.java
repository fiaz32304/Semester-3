public class App {
    public static void main(String[] args) throws Exception {
            reference p1=new reference("Fiaz",12);
            p1.display();
            reference p2=p1;
            p2.name="Ali";
            p2.age=14;
            p2.display();
            p1.display();


    }
}
