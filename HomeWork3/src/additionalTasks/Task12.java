package additionalTasks;

import java.util.Scanner;

public class Task12 {
	//Verilmish metndeki butun reqemlerin sayini tapmali
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' ||s.charAt(i) == '6' || s.charAt(i) == '7'
					|| s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') {
				count++;
			}
		}
		if(count==0) {
			System.out.println("There is no number in this String !");
		}
		System.out.println(count);
	}
}
