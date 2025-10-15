public class point{
    private double x_cord;
    private double y_cord;

    public point(double x, double y){
        x_cord = x;
        y_cord = y;
    }
    public void setx_cord(double x){
        x_cord = x;

    }
    public double getx_cord(){
        return x_cord; 

    }
    public void sety_cord(double y){
        y_cord = y;

    }
    public double gety_cord(){
        return y_cord; 
        
    }
    public void display(){
        System.out.println("The point is::"+ x_cord);
        System.out.println("The point is::"+ y_cord);
    }   
}