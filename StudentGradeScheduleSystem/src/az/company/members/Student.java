package az.company.members;

import java.util.List;

import az.company.main.FileUtility;

public class Student {

	public static void seeMyResult(String nameAndSurname) throws Exception {
		List<String> arr = FileUtility.read();
		boolean a = false;
		for (int i = 0; i < arr.size(); i++) {

			String arr2[] = arr.get(i).split("--");
			if ((arr2[1] + " " + arr2[2]).equalsIgnoreCase(nameAndSurname)) {
				System.out.println("Name : " + arr2[1]);
				System.out.println("Surname : " + arr2[2]);
				System.out.println("Grade : " + arr2[3]);
				a = true;
			}

		}
		if (!a)
			System.out.println("No information !");
	}
}
