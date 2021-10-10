package additionalTasks;

import java.util.Scanner;

public class Task6 {
// Verilmish metinde 'A'-dan ferqli neche simbol var ?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'A') {
				count++;
			}
		}
		System.out.println("The number of letters different from 'A ' = " + count);
	}
}
