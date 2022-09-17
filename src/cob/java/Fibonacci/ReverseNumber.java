package cob.java.Fibonacci;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
	int n;
	int r;
	System.out.println("Enter any Number:");
	Scanner scan = new Scanner(System.in);
	n=scan.nextInt();

	while(n>0) {
		
		r=n%10;
		System.out.print(+r);
		n=n/10;
	
		
	}
	
	}

}
