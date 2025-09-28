public  class circle_1{
    private double radius;

    circle_1(){
      radius=2.5;  
    }
    circle_1(double r){
        radius=r;
    }public void setradius(double r){
        radius=r;
    }
    public double getradius(){
        return radius;
    }
    public void display(){
        System.out.println("the radius is::"+radius);
    }
    public double circumference(){
        double a=2*3.14*radius;
        return a;

    }
}
