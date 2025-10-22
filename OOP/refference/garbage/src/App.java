public class App {
    public static void main(String[] args) throws Exception {
        garbage g1=new garbage("fiaz",21,"brown");
        g1=null;
        System.gc();
        

        g2.display();
        g1.display();

    }
}
