
public class circle{
   private double radius;

    circle(){
        radius=1;
    }
    circle(double newradius){
        radius=newradius;

    }
    public void set_radius(double newradius){
        radius=newradius;

    }
    public double get_area(){
        return radius*radius*3.14;

    }public double get_perimeter(){
        return radius*2*3.14;

    }
}