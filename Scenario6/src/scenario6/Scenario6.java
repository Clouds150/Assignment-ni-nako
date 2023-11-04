package scenario6;
import java.util.Scanner;

public class Scenario6 {
    private static int c;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        																	//Scenario 6
        
        c = a-b;
        
        if(a == b) {
        	System.out.println("The difference between the two number is: "+c);
        }
        else {
        	System.out.println("The first number and second number are not the same");
        }
	
	}
} 