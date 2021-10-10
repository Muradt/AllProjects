package additionalTasks;

import java.util.Scanner;

public class Task10 {
	//Verilmish metinde son simboldan bashqa qalan simbollari boyuk chap etmeli
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		s=s.toUpperCase();
		for(int i = 0;i<s.length();i++) {
			if(i!=s.length()-1) {
				System.out.print(s.charAt(i));
				
			}
			else {
				s=s.toLowerCase();
				System.out.print(s.charAt(i));
			}
		}
	}
}
