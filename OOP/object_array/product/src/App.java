import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        product [ ] products={new product("laptop",1,10000),
                            new product("smartphone",2,1000),
                            new product("tablet",3,700),
                            new product("hedphones",6,500),
                            new product("charger",5,100),

        };
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the productt name to search");
        String search=sc.next();

        boolean found=false;
        for(product p:products){
            if(p.name.equalsIgnoreCase(search)){
                System.out.println("product foud"+p.id+"-"+p.name+"-"+p.price);
                found=true; 
                break;

            }
        }
        if(!found){
            System.out.println("product not found");
        }

    }
}
