package tasks;

import java.util.Scanner;
//Her hansi 2 cumle klaviaturadan daxil edilecek.
//Bu cumlelerin uzunluqlari ferqinin modulunu tapib,uzunlugu boyuk olani ,
//ferqin modulu qeder quvvete yukseltmek teleb olunur.
public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter second String : ");
		String s2 = sc.nextLine();
		int difference = s1.length() - s2.length();
		double result;
		if (difference < 0) {
			difference *= -1;
		}
		System.out.println("s1 length = " + s1.length());
		System.out.println("s2 length = " + s2.length());
		System.out.println("module difference of them = " + difference);

		if (s1.length() > s2.length()) {
			int preResult = s1.length();
			result = Math.pow(preResult, difference);
		} else {
			int preResult = s2.length();
			result = Math.pow(preResult, difference);
		}
		System.out.println("result = " + result);
	}
}
