package az.company.main;

import java.util.Scanner;

import az.company.members.Dechan;
import az.company.members.Student;
import az.company.members.Tyutor;

public class Method {
	private static Scanner sc = new Scanner(System.in);

	public static boolean checkDechhanUserNameAndPassword(String userName, String password) throws Exception {
		if (Dechan.DECHAN_USER_NAME.equals(userName) && Dechan.DECHAN_PASSWORD.equals(password))
			return true;
		else
			return false;

	}

	public static boolean checkTyutorUserNameAndPassword(String userName, String password) throws Exception {
		if (Tyutor.TYUTOR_USER_NAME.equals(userName) && Tyutor.TYUTOR_PASSWORD.equals(password))
			return true;
		else
			return false;

	}

	public static String[] enterUserNameAndPassword() {
		Scanner sc = new Scanner(System.in);
		String[] nameAndPassword = new String[2];
		System.out.println("Enter user name :");
		String userName = sc.next();
		sc.nextLine();
		System.out.println("Enter password :");
		String password = sc.next();
		nameAndPassword[0] = userName;
		nameAndPassword[1] = password;
		return nameAndPassword;
	}

	public static void startProgram() throws Exception {
		System.out.println("Welcome to Our Console App !");
		System.out.println("Enter as a ...\n1.Dechan\n2.Tyutor\n3.Student");
		int choice;

		System.out.print("Choice : ");
		choice = sc.nextInt();
		String arr[] = null;
		switch (choice) {
		case 1:
			arr = enterUserNameAndPassword();

			if (checkDechhanUserNameAndPassword(arr[0], arr[1]))
				Dechan.seeSchedule();
			else
				System.err.println("Wrong User Name or Password !");

			break;
		case 2:
			arr = enterUserNameAndPassword();
			if (checkTyutorUserNameAndPassword(arr[0], arr[1]))
				Tyutor.setStudentInformation();
			else
				System.err.println("Wrong User Name or Password !");

		case 3:

			Student.seeMyResult(enterStudentNameAndSurname());
			break;
		default:
			System.err.println("Invalid Input");
		}
	}

	public static String enterStudentNameAndSurname() {
		System.out.println("Enter Your Name And Surname : ");
		sc.nextLine();
		String studentNameAndSurname = sc.nextLine();
		return studentNameAndSurname;
	}
}
