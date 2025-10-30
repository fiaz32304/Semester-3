public class App {
    public static void main(String[] args) throws Exception {
        car c1=new car("audi","2500","petrol",20000000);
        c1.setmodel("civic");
        c1.sethorsepower("2300");
        c1.setfueltype("deseil");
        c1.setprice(567456);

       
       System.out.println( c1.getmodel());
        System.out.println(c1.gethorsepower());
        System.out.println(c1.getfueltype());
        System.out.println(c1.getprice());

    }
}
