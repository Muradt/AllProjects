package tasks;

import java.util.Scanner;
//"komputerle mesgul oluram." Ve "Men Adnada tehsil aliram,"
//cumlelerinin uzunluqlarini muqayise ele ve uzunlugu max olani cap et 
public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter second String : ");
		String s2 = sc.nextLine();
		System.out.println("length of s1 = "+s1.length());
		System.out.println("length of s2 = "+s2.length());
		if(s1.length()>s2.length()) {
			System.out.println(s1);
		}
		else if(s1.length()>s2.length()) {
			System.err.println(s2);
		}
		else {
			System.out.println("Cumleler beraberdir.");
		}
	}
}
