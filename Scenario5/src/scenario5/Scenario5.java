package scenario5;
import java.util.Scanner;


public class Scenario5 {
    private static int c;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        																	//Scenario 5
        
        c = a-b;
        
        if(a < b) {
        	System.out.println("The total is invalid: ");
        }
        else {
        	System.out.println("The total is: "+c);
        }
	
	}
}
