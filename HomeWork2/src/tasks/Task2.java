package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

//	a-b araliginda olan n sayda random ededlerin hasilini cemini tapilmasi ,40 – 200 araliginda

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rr = new Random();
		int a, b, n;
		long product = 1,sum=0;
		System.out.print("Please enter a : ");
		a = sc.nextInt();
		System.out.print("Please enter b : ");
		b = sc.nextInt();
		System.out.println("How many number do you want  ? ");
		n = sc.nextInt();
		if(a>b) {
			a=a+b;
			b=a-b;
			a=a-b;
		}

		for (long i = 0; i < n; i++) {

			int randomNum = a + rr.nextInt(b - a);
			product *= randomNum;
			sum+=randomNum;
			System.out.println("Number " + (i + 1) + "=" + randomNum);
		}

		System.out.println("The product of numbers between " + a + " and " + b + " is " + product);
		System.out.println("The sum of numbers between " + a + " and " + b + " is " + sum);
	}

}
