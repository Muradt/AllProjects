package additionalTasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Task16 {
//	Verilmish metnde sozler bosluq(probel) ile ayrilib.
//	Ilk ve son simbolu eyni olan sozleri tapmali.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			if (s1[i]!=""&&(s1[i].charAt(s1[i].length() - 1) == s1[i].charAt(0))) {
				System.out.println(s1[i]);
			}

		}
	}
}
