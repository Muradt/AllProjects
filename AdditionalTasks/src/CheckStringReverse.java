import java.util.Scanner;

public class CheckStringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String s1 = sc.nextLine();
		System.out.println("Enter second string : ");
		String s2 = sc.nextLine();
		boolean b = true;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
				b = false;
			}
		}
		if (b == true) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
	}
}
