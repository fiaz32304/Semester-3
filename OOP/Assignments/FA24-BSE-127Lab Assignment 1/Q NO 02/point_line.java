public class point_line {
    private point start_point;
    private point end_point;

    public point_line(point start, point end){
        start_point = start;
        end_point = end;
    }
    public double findlength(){
        double x1=start_point.getx_cord();
        double y1=start_point.gety_cord();
        double x2=end_point.getx_cord();
        double y2=end_point.gety_cord();
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
    public void display(){
        System.out.println("The length of the line is::"+ findlength());

    }     

}

