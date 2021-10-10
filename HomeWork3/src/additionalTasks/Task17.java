package additionalTasks;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String a = sc.nextLine();
		String s = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c > 96 && c < 122) {
				c -= 32;

			} else if (c > 64 && c < 90) {
				c += 32;

			}
			s += c;
		}
		System.out.println("Result : " + s);
	}

}
