package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
	// a � b araliginda her hansi bir c ededinin kubunu hesablayin.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a, b, number, cub;
		System.out.print("Please enter a : ");
		a = sc.nextDouble();
		System.out.print("Please enter b : ");
		b = sc.nextDouble();
		if (a > b) {
			System.err.println("a b-den boyuk ola bilmez");
			return;
		}
		System.out.print("Please enter number between " + a + " and " + b + " : ");
		number = sc.nextDouble();
		if (number >= a && number <= b) {
			cub = number * number * number;
			System.out.printf("The cube of " + number + " is %.2f" , cub);
		}else {
			System.out.println("\nPlease enter number in a given interval ! ");
		}
		
		main(args);
	}
}
