package tasks;

import java.util.Scanner;

public class Task11 {
//	•	Həftənin günlərini göstərən proqram yazın . 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Zehmet olmasa gun daxil edin : (1-7)");
		System.out.println("--------------------------------------");
		day = sc.nextInt();
		
		if (day >= 1 && day <= 7) {
			switch (day) {

			case 1:
				System.out.println(day + " - Monday");
				break;
			case 2:
				System.out.println(day + " - Tuesday");
				break;
			case 3:
				System.out.println(day + " - Wednesday");
				break;
			case 4:
				System.out.println(day + " - Thursday");
				break;
			case 5:
				System.out.println(day + " - Friday");
				break;
			case 6:
				System.out.println(day + " - Saturday");
				break;
			case 7:
				System.out.println(day + " - Sunday");
				break;
			}
		}
		else {
			System.err.println("Zehmet olmasa verilen araliqda daxil edin ! : \n");
		}
		
		main(args);

	}

}
