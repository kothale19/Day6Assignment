package cob.java.Fibonacci;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		int count = 0;
		System.out.println("Enter any number:");
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		if (count == 2)
			System.out.println("It is a Prime Number");
		else
			System.out.println("It is not a Prime Number");
		
		
		
		}
}