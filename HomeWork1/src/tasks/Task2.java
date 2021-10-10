package tasks;
import java.util.Scanner;

public class Task2 {
//	4 eded goturulur. Bu ededlerin tek  ve ya cut olmasini yoxlayin. Lazim olan butun sertler yoxlanilsin.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Please enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Please enter num3 : ");
		int num3 = sc.nextInt();
		System.out.print("Please enter num4 : ");
		int num4 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("num1 cutdur");
		} else {
			System.out.println("num1 tekdir");
		}

		if (num2 % 2 == 0) {
			System.out.println("num2 cutdur");
		} else {
			System.out.println("num2 tekdir");
		}

		if (num3 % 2 == 0) {
			System.out.println("num3 cutdur");
		} else {
			System.out.println("num3 tekdir");
		}

		if (num4 % 2 == 0) {
			System.out.println("num4 cutdur");
		} else {
			System.out.println("num4 tekdir");
		}

	}

}
