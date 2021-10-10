package tasks;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double count = 1;
		System.out.println("\n\n       log a esasdan b - nin hesablanma programi\n\n");
		System.out.println("Zehmet olmasa a-ni daxil edin : ");
		double a = sc.nextDouble();
		System.out.println("Zehmet olmasa b-ni daxil edin : ");
		double b = sc.nextDouble();

		System.out.println(Math.log10(b) / Math.log10(a));

	}
}
