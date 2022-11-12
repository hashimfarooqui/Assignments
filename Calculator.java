import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter 1 for Addition");
		System.out.println("enter 2 for Substraction");
		System.out.println("enter 3 for Multiplication");
		System.out.println("enter 4 for Division");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Please enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println(addition(a,b));
		break;
		case 2:System.out.println(substraction(a,b));
		break;
		case 3:System.out.println(multipication(a,b));
		break;
		case 4:System.out.println(division(a,b));
		break;
		}

	}

	public static int substraction(int a, int b) {
		int c= a-b;
		return c;
	}

	public static int addition(int a,int b) {
		int c = a+b;
		return c;
	}
	public static int multipication(int a, int b) {
		int c= a*b;
		return c;
	}
	public static int division(int a,int b) {
		int c = a/b;
		return c;
	}
}
