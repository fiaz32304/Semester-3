public class adhoc extends employe{
    private int numberofworkingdays;
    private int wage;

    adhoc(String name,String phone, String adress,int allowance, int numberofworkingdays ,int wage){
        super(name,phone,adress,allowance);
        this.numberofworkingdays=numberofworkingdays;
        this.wage=wage;

    }   
    public void show_display(){
        super.display();
        System.out.println("the number of working days are::"+numberofworkingdays);
                System.out.println("wages are::"+wage);
    } 
}
