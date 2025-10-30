public class car{
    private String model;
    private String horsepower;
    private int price;
    private String fueltype;

    car(String model,String horsepower,String fueltype,int price){
        this.model=model;
        this.horsepower=horsepower;
        this.fueltype=fueltype;
        this.price=price;

    }public void setmodel(String model){
        this.model=model;
    }
    public String getmodel(){
        return model;
    }
    public void sethorsepower(String horsepower){
        this.horsepower=horsepower;
    }
    public String gethorsepower(){
        return horsepower;
    }
    public void setprice(int price){
           this.price=price;
              
    }
    public int getprice(){
        return price;
    }
    public void setfueltype(String fueltype){
        this.fueltype=fueltype;
    }
    public String getfueltype(){
        return fueltype;
    }
}