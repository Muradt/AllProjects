import java.util.Scanner;

public class FindNumOfDigitsNumber {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number you want the count of digits : ");
		int a = sc.nextInt();
		System.out.print("Number  of  digits in " + a);
		while (a >= 1) {
			count++;
			a = a / 10;
		}
		System.out.println(" is " + count);
	}
}
