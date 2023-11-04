package bmi;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.print("Enter your Height: ");
    	double h = sc.nextDouble();
    	System.out.print("Enter your Weight: ");
    	double w = sc.nextDouble();
    	
    	double c = h * h;
    	double d = w / c;
    	double e = Math.round(d);
    	
    	if (e>=50) {
    		System.out.println("You are extremely fat");
    	}
    	else if(e>=40) {
    		System.out.println("You are severely obese");
    	}
    	else if(e>=35) {
    		System.out.println("You are really obese.");
    	}
    	else if(e>=25) {
    		System.out.println("You are overweight");
    	}
    	else if(e>=18.5) {
    		System.out.println("You are normal");
    	}
    	else {
    		System.out.println("You are underweight");
    	}
    	
    	
    	
    
    	System.out.println("Your BMI: "+e);
    	
    	
    	
    	
    }
}