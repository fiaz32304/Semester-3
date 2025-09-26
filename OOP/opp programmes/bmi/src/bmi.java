public class bmi{
    public String name;
    public int age;
    public double weight;
    public double height;

    bmi(String n,int a,double w,double h){
        name=n;
        age=a;
        weight=w;
        height=h;
    }
    public void display(){
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("weight"+weight);
        System.out.println("height"+height);
    }
    public double calculatebmi(){
        double bmi=weight/(height*height);
        return bmi;

    }public String getstatus(){
        double bmi=calculatebmi();
        if(bmi<18.5){
           return "underweight";
        }else if(bmi<24.5){
            return "normal weight";
        }else if(bmi<29.5){
            return "overweight";
        }
        else{
            return "obese";
        }
        

        }
        public String getname(){
            return name;

    }
    public int getage(){
        return age;

    }
    public double getweight(){
        return weight;

    }
    public double getheight(){
        return height;
        
    }
}