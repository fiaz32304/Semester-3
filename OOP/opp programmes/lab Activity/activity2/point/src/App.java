public class App {
    public static void main(String[] args) throws Exception {
        point p1=new point(10,20);
        point p2=new point(30,40);
        point p3=new point();
        point p4=p3.add(p1,p2);
        p4.show();

    }
}
