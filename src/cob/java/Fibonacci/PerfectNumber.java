package cob.java.Fibonacci;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Perfect Number Program!!");
		System.out.println("Enter any Number:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum)
			System.out.println("it is a Perfect Number");
		else
			System.out.println("It is not a Perfect Number");

	}
}
