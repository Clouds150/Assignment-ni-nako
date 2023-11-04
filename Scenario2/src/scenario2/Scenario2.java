
package scenario2;
import java.util.Scanner;

public class Scenario2 {

    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your 1st number");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd number");
        double b = sc.nextDouble();
        
        double c;
        c = a+b;
        
        System.out.println("Your 1st number is " +a);
        System.out.println("Your 2nd number is " +b);
        System.out.println("Total amount is " +c);
    }
    
}
