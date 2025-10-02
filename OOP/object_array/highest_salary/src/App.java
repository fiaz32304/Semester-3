public class App {
    public static void main(String[] args) throws Exception {
    employe [] employes={new employe("ali",50000),
                        new employe("sara",75000),
                        new employe("john",60000),
                        new employe("john",80000),
                        new employe("john",60000)

};
employe lowest=employes[0];
employe highest =employes[0];
for(employe e:employes){
    if(e.salary>highest.salary){
        highest=e;
    }
    if(e.salary<lowest.salary)
        lowest=e;

}
System.out.println("highest paid::"+ highest.name +" highest salary::"+highest.salary);
System.out.println("lowest paid::"+ lowest.name +" lowest salary::"+lowest.salary);


    }
}
