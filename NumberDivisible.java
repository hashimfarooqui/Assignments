
public class NumberDivisible {

	public static void main(String[] args) {
		int n=23;
		System.out.println("The numbers that are divisible by 23 are as follows");
		for(int i=10;i<=150;i++)
		{
			if (i%n==0) {
				System.out.print(i+" ");
				
			}
		}

	}

}
