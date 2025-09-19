public class person{
    private String modelnumber;
    private String partnumber;
    private String cost;

    public void person(String m,String p,String c){
        modelnumber=m;
        partnumber=p;
        cost=c;
    }
    public void display(){
        System.out.println(modelnumber);
        System.out.println(partnumber);
        System.out.println(cost);

    }
}