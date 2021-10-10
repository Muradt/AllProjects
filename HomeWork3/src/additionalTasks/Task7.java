package additionalTasks;

import java.util.Scanner;

public class Task7 {
	// Verilmish metnin son 15 simbolunda 'B' simbolu varmi ?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s1 = sc.nextLine();
		boolean val = false;

		if (s1.length() < 15) {
			System.err.println("There are not 15 symbol in this string !");
			return;
		}
		String s2 = s1.substring(s1.length() - 16);
		if (s2.indexOf('b') != -1) {
			System.out.println("Symbol 'b' exists in last 15 charachter of string");
		}
		else {
			System.out.println("Symbol 'b'  does not exist in last 15 charachter of string");
		}

	}
}
