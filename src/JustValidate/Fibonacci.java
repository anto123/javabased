package JustValidate;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit = scan.nextInt();
		int a = 0, b= 0, c =1;
		for(int i=0; i<=limit; i++){ 
		a = b;
		b = c;
		c = a+b;
		System.out.println(c);
		}
		//System.out.println(c);
	}

}
