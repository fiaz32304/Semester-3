
import java.util.Scanner;

public class App { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Carpart car1 = new Carpart(); 
        System.out.println("What is Model Number?"); 
        System.out.println("What is Part Number?"); 
        System.out.println("What is Cost?"); 
        String x = sc.nextLine(); 
        String y = sc.nextLine(); 
        String z = sc.nextLine(); 
        car1.setparameter(x, y, z); 
        car1.display(); 
    }
}