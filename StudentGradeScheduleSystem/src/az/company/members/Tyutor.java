package az.company.members;

import java.util.Scanner;

import az.company.main.FileUtility;

public class Tyutor extends Person {
	public static final String TYUTOR_USER_NAME = "Tyutor";
	public static final String TYUTOR_PASSWORD = "Tyutor12345";

	public static void setStudentInformation() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many student will yo enter ? ");
		System.out.print("Number : ");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter Student name : ");
			String name = sc.next();
			System.out.println("Enter Student surname : ");
			String surName = sc.next();
			System.out.println("Enter Student grade : ");
			int grade = sc.nextInt();
			if (grade >= 91) {
				FileUtility.writeintoFile("s--" + name + "--" + surName + "--" + grade, true);
			} else if (grade < 91 && grade >= 81) {
				FileUtility.writeintoFile("m--" + name + "--" + surName + "--" + grade, true);
			} else {
				FileUtility.writeintoFile("w--" + name + "--" + surName + "--" + grade, true);
			}

		}

	}

}
