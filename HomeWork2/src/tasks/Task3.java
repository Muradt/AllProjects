package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
	// a-b araliginda olan tesadufi 2 eded sec onlarin min max hesablamaq
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rr = new Random();
		int num1, num2, random1, random2;
		System.out.print("Please enter num1 : ");
		num1 = sc.nextInt();
		System.out.print("Please enter num2 : ");
		num2 = sc.nextInt();
		random1 = num1 + rr.nextInt(num2 - num1);
		random2 = num1 + rr.nextInt(num2 - num1);
		System.out.println("First random number : " + random1);
		System.out.println("Second random number : " + random2);
		if (random1 > random2) {
			System.out.println("The max is " + random1);
		} else if (random1 == random2) {
			System.out.println("They are equal !");
		} else {
			System.out.println("The max is " + random2);
		}

	}
}
