package additionalTasks;

import java.util.Scanner;

public class Task11 {
	//Verilmish metndeki butun 'A' simbollarini ilk 'B' simbollarini son simbol ile evez etmeli
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		s=s.replace('A', s.charAt(0));
		s=s.replace('B', s.charAt(s.length()-1));
		System.out.println(s);
	}
}
