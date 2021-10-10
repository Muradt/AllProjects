package additionalTasks;

import java.util.Scanner;

public class Task8 {
	//Verilmish metinde son ve ilk simbolun yerini deyishmeli
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		char c1 =s.charAt(0);
		char c2 = s.charAt(s.length()-1);
		s=s.substring(1, s.length()-1);
		s= c2+s+c1;
		System.out.println(s);
		
		
	}
}
