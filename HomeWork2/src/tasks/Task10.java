package tasks;

import java.util.Scanner;

public class Task10 {
	// Klaviaturadan daxil edilmish 2 ededin EBOB-unu ve EKOB-unu tapan proqram
	// tertib edin.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;

		System.out.print("Zehmet olmasa n1-ni daxil edin : ");
		n1 = sc.nextInt();
		System.out.print("Zehmet olmasa n2-ni daxil edin : ");
		n2 = sc.nextInt();

		int lcm;

		lcm = (n1 > n2) ? n1 : n2;

		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
				break;
			}
			++lcm;
		}
		int gcd = 1;

		for (int i = 1; i <= n1 && i <= n2; i++) {

			if (n1 % i == 0 && n2 % i == 0)

				gcd = i;
		}

		System.out.printf("\nGCD of %d and %d is: %d", n1, n2, gcd);

	}
}
