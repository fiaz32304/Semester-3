public class App {
    public static void main(String[] args) throws Exception {
        person p1=new person("Fiaz ", 22, 22000, true);
        person q=p1;
        p1.age=23;
        q.view_information();
        

    }
}
