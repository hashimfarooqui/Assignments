import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if (rev==temp) {
			System.out.println("the given number is palindrome");
			
		} else {
			System.out.println("the given number is not  palindrome");
		}
		

	}

}
