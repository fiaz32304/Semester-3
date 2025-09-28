public class App {
    public static void main(String[] args) throws Exception {
        point_3 c1=new point_3();
        c1.setx(5);
        System.out.println("the x is::"+c1.getx());
        c1.sety(6);
        System.out.println("the y is::"+c1.gety());
        c1.display();
        point_3 c2=new point_3(11,12);
        c2.movepoint(7,8);
        c2.display();



    }
}
