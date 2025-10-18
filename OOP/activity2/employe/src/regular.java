public class regular extends employe{
    private int basicpay;
    regular(String name,String phone,String adress,int allowance,int basicpay){
        super(name,phone,adress,allowance);
        this.basicpay=basicpay;

    }   
    public void display(){
        System.out.println("name is::"+name);
        System.out.println("phone is::"+phone);
        System.out.println("adress is::"+adress);
        System.out.println("allowance is::"+allowance);
        System.out.println("basicpay is"+basicpay);
        
        

    }
}
