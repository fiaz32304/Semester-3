public class App { 
    public static void main(String[] args) throws Exception {
        circle c1=new circle();
        c1.set_radius(1);
        System.out.println("the area of circle is::"+c1.get_area());
        System.out.println("the area of circle is::"+c1.get_perimeter());

        circle c2=new circle(25);
        System.out.println("the area of circle is::"+c2.get_area());
        System.out.println("the area of circle is::"+c2.get_perimeter());

        circle c3=new circle(125);
        System.out.println("the area of circle is::"+c1.get_area());
        System.out.println("the area of circle is::"+c1.get_perimeter());
    }  
}
