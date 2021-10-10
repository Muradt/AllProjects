package tasks;

import java.util.Scanner;

public class Task5 {
//	Müəyyən bir cümlə daxil edin.Əgər daxil olunmuş 
//	cümlə “r”hərfi ilə bitərsə,onda həmin sətirdən 
//	1-ci simvoldan başlayaraq 10 dənəsini başqa bir sətirlər
//	massivi düzəldib 0-cı simvoldan başlayaraq yazsın ,
//	yox eger saitlə bitirsə onda hemin sətir massivinə 5-ci simvoldan 
//	başlayaraq yazsin.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		char[] mass = new char[20];

		if (s.endsWith("r")) {
			for (int i = 0; i < 10; i++) {
				if (s.length() <= i) {
					System.err.println("index out of bound ! ");
					break;
				}
				mass[i] += s.charAt(i);
			}
			System.out.println(mass);
		} else if (s.endsWith("a") || s.endsWith("i") || s.endsWith("o") || s.endsWith("u") || s.endsWith("e")) {
			for (int i = 0; i < 10; i++) {
				if (s.length() <= i + 4) {
					System.err.println("index out of bound ! ");
					break;
				}
				mass[i] += s.charAt(i + 4);
			}
			System.out.println(mass);
		} else {
			System.err.println("This word ends with different consonant beside 'r'");
		}

	}
}
