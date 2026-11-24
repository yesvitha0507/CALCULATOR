package Revision;
import java.util.Scanner;

public class Calculator {
	public static int add(int a,int b) {
		return a+b;
	}
    public static int sub(int a,int b) {
		return a-b;
	}
    public static int mul(int a,int b) {
		return a*b;
	}
    public static int div(int a,int b) {
		return a/b;
	}
    public static void calculatorr() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("+,-,*,/");
    	System.out.print("ENTER OPERATOR=");
    	char op=sc.next().charAt(0);
    	System.out.print("Enter NUM1=");
    	int a=sc.nextInt();
    	System.out.print("Enter NUM2=");
    	int b=sc.nextInt();
    	switch(op)
    	{
    	case '+':
    		System.out.println("ADDITION="+add(a,b));
    		break;
    	case '-':
    		System.out.println("SUBTRACTION="+sub(a,b));
    		break;
    	case '*':
    		System.out.println("MULTIPLICATION="+mul(a,b));
    		break;
    	case '/':
    		System.out.println("DIVISION="+div(a,b));
    		break;
    	default:
    		System.out.println("invalid input!");
    		break;
    	}
    
    	}
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int y = 1;
    	while(y==1) {
    		calculatorr();
    		System.out.println("ENTER ::: YES-1  /  NO-2");
        	System.out.println("Do you want to continue again:");
        	y = s.nextInt();
    	}
    	System.out.println("THANK YOU!");

    	
    	
    }

}
