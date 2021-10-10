package additionalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
//	Verilmish metnde sozler bosluq(probel) ile ayrilib.
//	En uzun ve en qisa sozleri tapmali.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		String[] s1 = s.split(" ");

		System.out.println(Arrays.toString(s1));
		int max = s1[0].length(), min = s1[0].length();
		for (int i = 0; i < s1.length ; i++) {

			if (max < s1[i].length()) {
				max = s1[i].length();

			}
		}
		for (int i = 0; i < s1.length ; i++) {

			if (min > s1[i].length()) {
				min = s1[i].length();

			}
		}
		for(int i = 0; i < s1.length; i++) {
			if(s1[i].length()==max) {
				System.out.println("The longest word : " + s1[i]);
			}
			if(s1[i].length()==min) {
				System.out.println("The shortest word : " + s1[i]);
			}
		}

	

	}
}
