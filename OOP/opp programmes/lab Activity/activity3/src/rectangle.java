public class rectangle{
    public int length;
    public int width;

    public  rectangle(){
        length=5;
        width=10;
    }
    public void rectangle(int l, int w){
        length=l;
        width=w;

    }
    public int calculatearea(){
        return (length*width);   

    }
}