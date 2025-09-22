 class employe{

    public int salary;
    public String name;

    public void display(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
     }

    public int getsalary(){
        return salary;

    }
    public String getname(){
        return name;
    }
     public void setname(String n){
        name=n;
     }
    }