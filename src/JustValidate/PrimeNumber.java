package JustValidate;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int number, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number :");
		number = scan.nextInt();
		if (number % 2 == 0) {
			count++;
		}
		if (count == 0) {
			System.out.println("its prime number");
		} else {
			System.out.println("its not a prime number");
		}
	}

}
