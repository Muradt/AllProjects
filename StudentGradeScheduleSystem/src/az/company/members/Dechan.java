package az.company.members;

import java.util.List;

import az.company.main.FileUtility;

public class Dechan extends Person {

	public static final String DECHAN_USER_NAME = "Dechan";
	public static final String DECHAN_PASSWORD = "Dechan12345";

	public static void seeSchedule() throws Exception {
		List<String> arr = FileUtility.read();
		System.out.println("Schedule\n-----------------\nSuperiors");
		for (int i = 0; i < arr.size(); i++) {

			String arr2[] = arr.get(i).split("--");
			if (arr2[0].equals("s")) {
				System.out.println("Name : " + arr2[1]);
				System.out.println("Surname : " + arr2[2]);
				System.out.println("Grade : " + arr2[3]);

			}

		}
		System.out.println("------------------");
		System.out.println("Middles");
		for (int i = 0; i < arr.size(); i++) {

			String arr2[] = arr.get(i).split("--");
			if (arr2[0].equals("m")) {
				System.out.println("Name : " + arr2[1]);
				System.out.println("Surname : " + arr2[2]);
				System.out.println("Grade : " + arr2[3]);

			}

		}
		System.out.println("------------------");
		System.out.println("Weaks");
		for (int i = 0; i < arr.size(); i++) {

			String arr2[] = arr.get(i).split("--");
			if (arr2[0].equals("w")) {
				System.out.println("Name : " + arr2[1]);
				System.out.println("Surname : " + arr2[2]);
				System.out.println("Grade : " + arr2[3]);
			}

		}
	}
}
