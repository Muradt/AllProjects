package tasks;

import java.util.Scanner;

public class Task9 {
//	Klaviaturadan daxil edilmish ededin sade , yoxsa murekkeb eded olmasini mueyyenleshdiren proqram tertib edin.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, count = 0;
		System.out.print("Zehmet olmasa a-ni daxil edin : ");
		a = sc.nextInt();
		for (int i = 1; i <= a; i++) {

			if (a % i == 0) {

				count++;
			}

		}
		if (count > 2) {
			System.out.println("Murekkeb ededdir !");
		} else {
			System.out.println("Murekkeb eded deyil !");
		}

	}

}
