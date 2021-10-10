package additionalTasks;

import java.util.Scanner;

public class Task9 {
	//Verilmish metinde ilk simboldan bashqa qalan simbollari kicik chap etmeli
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		String s2 = s.substring(1);
		s2=s2.toLowerCase();
		System.out.println(s.charAt(0)+s2);
		
		
//		for(int i = 0;i<s.length();i++) {
//			if(i==0) {
//				s=s.toUpperCase();
//				System.out.print(s.charAt(i));
//				s=s.toLowerCase();
//			}
//			else {
//				System.out.print(s.charAt(i));
//			}
//		}

	}
}
