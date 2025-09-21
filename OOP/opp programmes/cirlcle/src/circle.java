public class circle{
    public double radius;
    
        public circle(){
            radius=1.0;

        }
        public circle(double r){
            radius=r;
        }
        public void setradius(double r){
                radius=r;
        }
        public double getradius(){
            return radius;
        }
        public double area(){
            return Math.PI*radius*radius;
        }
        public void show(){
            System.out.println("Radius: "+radius);
            System.out.println("Area: "+area());

        }
}

    
