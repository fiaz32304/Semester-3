public class rectangle_2{
    private int width;
    private int length;

     public rectangle_2(){
        int length=3;
        int width=4;

    }public rectangle_2(int l,int w){
        length=l;
        width=w;

    }public void setlength(int l){
        length=l;

    }public int getlength(){
        return length;

    }public void setwidth(int w){
        width=w;

    }public int getwidth(){
        return width;

    }public int area(){
        int area=length*width;
        return area;
    }
}