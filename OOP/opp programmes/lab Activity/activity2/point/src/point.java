public class point {
    private int x;
    private int y;

    public point(){
        x=5;
        y=6;

    }
    public point(int a,int c){
        x=a;
        y=c;

    }
    public void setx(int a){
        x=a;
    }public void sety(int c){
        y=c;

    }
    public int getx(){
        return x;
    }public int gety(){
        return y;
    }
    public point add(point pa,point pc){
        point p_new=new point(x+pa.x+pc.x,y+pa.y+pc.y);
        return p_new;

    }
    public void show(){
        System.out.println(x);
        System.out.println(y);
        
    }

} 