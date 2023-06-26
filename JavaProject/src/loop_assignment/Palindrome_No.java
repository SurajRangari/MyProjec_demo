package loop_assignment;

import java.util.Scanner;

public class Palindrome_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int num = sc.nextInt();
		int temp = num;
		int reverse = 0;

		// loop to find reverse no.
		while (num > 0) {
			int d = num % 10;
			reverse = reverse * 10 + d;
			num = num / 10;
		}

		// checking palindrome or not
		if (reverse == temp) {
			System.out.println("Palindrome no.");
		} else {
			System.out.println("Not Palindrome no.");
		}
		sc.close();
	}

}
