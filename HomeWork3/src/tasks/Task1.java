package tasks;

import java.util.Scanner;
//	“komputerle mesgul oluram” ve “Men Adnada tehsil aliram," cumlelerini birlesdirin
public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter second String : ");
		String s2 = sc.nextLine();
		String result = s1.concat(" "+s2);
		System.out.println(result);
	}
}
