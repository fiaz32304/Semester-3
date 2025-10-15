public class App {
    public static void main(String[] args) throws Exception {
    point p1 = new point(2,3);
    point p2 = new point(10,7);
    point_line line1 = new point_line(p1,p2);
    line1.display();

    point p3 = new point(1,1);
    point p4 = new point(4,5);
    point_line line2 = new point_line(p3,p4);
    line2.display();


    }
}
