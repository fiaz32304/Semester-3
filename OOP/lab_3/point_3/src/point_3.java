public class point_3{
    private int x;
    private int y;

    public point_3(){
        int x=0;
        int y=0;

    }
    point_3(int a, int b){
        x=a;
        y=b;

    }public void setx(int a){
        x=a;

    }public int getx(){
        return x;


    }public void sety(int b){
        y=b;

    
    }public int gety(){
        return y;

    }public void display(){
        System.out.println("the x cordinate is::"+x);
        System.out.println("the y cordinate is::"+y);
    }public void movepoint(int a, int b){
        x=x+a;
        y=y+b;
    }
}