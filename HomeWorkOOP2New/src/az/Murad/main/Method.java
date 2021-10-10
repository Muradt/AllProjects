package az.Murad.main;

import java.util.Scanner;

import az.Murad.Others.Crud;
import az.Murad.Others.Group;
import az.Murad.Others.Lesson;
import az.Murad.Others.Student;
import az.Murad.Others.Teacher;

public class Method {
	private static Scanner sc = new Scanner(System.in);
	private static int choice;

	public static void startProgram() {
		System.out.println("Which one would you like to register ? \n1.Student\n2.Teacher\n3.Group\n4.Lesson");
		System.out.print("Choice : ");
		choice = sc.nextInt();
		if (choice < 1 || choice > 4) {
			throw new IllegalArgumentException("Choice should be in a range of 1 and 4 ! ");
		}
		callSwitch(choice);

	}

	private static void showCommonMethods() {
		System.out.println("What would you like to do ? \n1.Add\n2.Update\n3.Delete\n4.Search");
	}

	private static void callSwitch(int ch) {
		switch (ch) {

		case 1:
			Student st = fillAndReturnStudent();
			callSwitch2(st);
			break;
		case 2:
			Teacher tc = fillAndReturnTeacher();
			callSwitch2(tc);
			break;
		case 3:
			Group gp = fillAndReturnGroup();
			callSwitch2(gp);
			break;
		case 4:
			Lesson ls = fillAndReturnLesson();
			callSwitch2(ls);
			break;
		default:
			System.err.println("Wrong input !!!");

		}

	}

	

	private static void callSwitch2(Crud cr) {
		showCommonMethods();
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			cr.add(cr);
			break;
		case 2:
			cr.update(cr);
			break;
		case 3:
			cr.delete(cr);
			break;
		case 4:
			cr.search(cr);
			break;
		default:
			System.err.println("Wrong input !!!");

		}
	}

	private static Student fillAndReturnStudent() {
		Student st = new Student();
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter surname : ");
		String surName = sc.nextLine();
		System.out.print("Enter age : ");
		byte age = sc.nextByte();
		sc.nextLine();
		System.out.print("Enter phone number : ");
		String phoneNumber = sc.nextLine();
		System.out.print("Enter address : ");
		String address = sc.nextLine();
		System.out.print("Enter student Id : ");
		String studentId = sc.nextLine();
		st.setName(name);
		st.setSurName(surName);
		st.setAge(age);
		st.setPhoneNumber(phoneNumber);
		st.setAddress(address);
		st.setStudentId(studentId);
		return st;

	}

	private static Teacher fillAndReturnTeacher() {
		Teacher tc = new Teacher();
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter surname : ");
		String surName = sc.nextLine();
		System.out.print("Enter age : ");
		byte age = sc.nextByte();
		sc.nextLine();
		System.out.print("Enter phone number : ");
		String phoneNumber = sc.nextLine();
		System.out.print("Enter address : ");
		String address = sc.nextLine();
		System.out.print("Enter student Id : ");
		String teacherId = sc.nextLine();
		tc.setName(name);
		tc.setSurName(surName);
		tc.setAge(age);
		tc.setPhoneNumber(phoneNumber);
		tc.setAddress(address);
		tc.setTeacherId(teacherId);
		return tc;

	}

	private static Group fillAndReturnGroup() {
		Group gp = new Group();
		System.out.print("Enter  the name of group : ");
		String groupName = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter number of members : ");
		int numOfMembers = sc.nextInt();
		gp.setGroupName(groupName);
		gp.setNumOfMembers(numOfMembers);
		return gp;

	}

	private static Lesson fillAndReturnLesson() {
		Lesson ls = new Lesson();
		System.out.print("Enter  the name of lesson : ");
		String nameOfLesson = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter instructor full name : ");
		String instructorName = sc.nextLine();
		ls.setLessonName(nameOfLesson);
		ls.setInstructor(instructorName);
		return ls;

	}

}
