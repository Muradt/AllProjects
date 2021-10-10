package stringtasks;

import java.util.Scanner;

public class Task4 {
//	Cumle daxil edin.Daxil olunmush setirde 
//	kicik herfleri boyuk herfe, boyuk herfleri ise
//	kicik herfe cevirmek teleb olunur.Meselen ,
//	HelLO  Netice: hELlo
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		char c;
		String s2="";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				c=Character.toLowerCase(s.charAt(i));
				s2+=c;
			}
			else {
  				c=Character.toUpperCase(s.charAt(i));
  				s2+=c;
			}
		}
		System.out.println(s2);
		sc.close();
	}
}
