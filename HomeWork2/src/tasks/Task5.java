package tasks;

import java.util.Scanner;

public class Task5 {

	// a - b araliginda ancaq tam koku olan ededleri tapmaq ve kokunu hesablamaq
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean value = false;
		System.out.print("Zehmet olmasa a-ni daxil edin : ");
		a = sc.nextInt();
		System.out.print("Zehmet olmasa b-ni daxil edin : ");
		b = sc.nextInt();
		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		if (a < 0 || b < 0) {
			System.err.println("Error !");
			return;
		}

		for (int i = a; i < b; i++) {

			if (Math.sqrt(i) % 1 == 0) {
				value = true;
				System.out.println("The number : " + i + " and the square root is : " + Math.sqrt(i));
			}

		}

		if (!value) {
			System.out.println("Bu araliqda tam koku olan eded yoxdur !");
		}

	}

}
