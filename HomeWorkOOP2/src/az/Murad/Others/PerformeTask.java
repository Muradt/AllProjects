package az.Murad.Others;

import java.util.Scanner;

public class PerformeTask {
	static Scanner sc = new Scanner(System.in);
	private static String name, surName, phoneNumber, address, lessonName, instructor, studentID;
	private static byte age;
	private static Person p = null;
	private static Lesson ls = null;
	private static String studentId = null;
	private static Students st = null;
	
	public static void performProgram() {
		p = fillAndReturnPerson();
		ls = fillAndReturnLesson();
		studentId = setAndGetStudentID();
		st = new Students(p, ls, studentId);
		printInformationOfStudent();
	}

	private static void enterInformationOfPerson() {
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter surname : ");
		surName = sc.nextLine();
		System.out.print("Enter age : ");
		age = sc.nextByte();
		sc.nextLine();
		System.out.print("Enter phone number : ");
		phoneNumber = sc.nextLine();
		System.out.print("Enter address : ");
		address = sc.nextLine();

	}

	private static Person fillAndReturnPerson() {
		enterInformationOfPerson();
		return new Person(name, surName, age, phoneNumber, address);
	}

	private static void enterInformationOfLesson() {
		System.out.print("Enter lesson name : ");
		lessonName = sc.nextLine();
		System.out.print("Enter instructor name (name and surname) : ");
		instructor = sc.nextLine();

	}

	private static Lesson fillAndReturnLesson() {
		enterInformationOfLesson();
		return new Lesson(lessonName, instructor);
	}

	private static String setAndGetStudentID() {
		setStudentID();
		return studentID;
	}

	private static void setStudentID() {
		System.out.print("Enter studentid : ");
		studentID = sc.nextLine();
	}

	private static void printInformationOfStudent() {
		System.out.println("name : " + st.getName());
		System.out.println("surname : " + st.getSurName());
		System.out.println("age : " + st.getAge());
		System.out.println("Phone Number : " + st.getPhoneNumber());
		System.out.println("Address : " + st.getAddress());
		System.out.println("Lesson name : " + st.getLs().getLesson());
		System.out.println("Instructor name : " + st.getLs().getInstructor());
		System.out.println("Student ID : " + st.getStudentID());
	}
}
