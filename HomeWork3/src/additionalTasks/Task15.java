package additionalTasks;

import java.util.Scanner;

public class Task15 {
//	Verilmish metnde sozler bosluq(probel) ile ayrilib.
//	ilk ve son sozu silmeli.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		String s3 = "";
		for (int i = 1; i < s1.length - 1; i++) {
			s3 += s1[i] + " ";
			 
		}
		s3.trim();
		System.out.println(s3);
	}
}
