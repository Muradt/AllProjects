package tasks;

import java.util.Scanner;

public class Task6 {
	int a=3;
	// a – b araliginda olan ededlerin kublarini hesablayin.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Zehmet olmasa a-ni daxil edin : ");
		a = sc.nextInt();
		System.out.print("Zehmet olmasa b-ni daxil edin : ");
		b = sc.nextInt();
		if (a < b) {
			for (int i = a; i < b; i++) {
				System.out.println("The cub of " + i + " is " + i * i * i);

			}
		}
		else {
			for (int i = b; i < a; i++) {
				System.out.println("The cub of " + i + " is " + i * i * i);

			}
		}

	}

}
