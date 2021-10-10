package main;

import java.util.Scanner;

import calculator.Calculator;
import phone.Iphone;
import phone.Lg;
import phone.Nokia;
import phone.Samsung;

public class PerformeTask {
	public static Scanner sc = new Scanner(System.in);
	public static double a, b, result;
	public static int repeat;

	public static void startProgram() throws Exception {
		Menu.menu();
		System.out.print("Choice : ");
		int choice = sc.nextInt();
		if (choice < 1 || choice > 4) {
			throw new IllegalArgumentException("Choice should be in a range of 1 and 4 ! ");
		}
		callSwitch(choice);
	}

	public static void callSwitch(int choice) {
		int ch;
		switch (choice) {
		case 1:
			Iphone ip = new Iphone();
			ip.showCalculatorMethods();
			System.out.print("Choice : ");
			ch = sc.nextInt();
			if (ch < 1 || ch > 6)
				throw new IllegalArgumentException("Choice should be in a range of 1 and 6 ! ");
			performeIphone(ch, ip);
			break;
		case 2:
			Samsung sm = new Samsung();
			sm.showCalculatorMethods();
			System.out.print("Choice : ");
			ch = sc.nextInt();
			if (ch < 1 || ch > 6)
				throw new IllegalArgumentException("Choice should be in a range of 1 and 6 ! ");
			performeSamsung(ch, sm);
			break;
		case 3:
			Nokia nk = new Nokia();
			nk.showCalculatorMethods();
			System.out.print("Choice : ");
			ch = sc.nextInt();
			if (ch < 1 || ch > 6)
				throw new IllegalArgumentException("Choice should be in a range of 1 and 6 ! ");
			performeNokia(ch, nk);
			break;
		case 4:
			Lg lg = new Lg();
			lg.showCalculatorMethods();
			System.out.print("Choice : ");
			ch = sc.nextInt();
			if (ch < 1 || ch > 6)
				throw new IllegalArgumentException("Choice should be in a range of 1 and 6 ! ");
			performeLg(ch, lg);
			break;

		}
	}

	public static void commonMethodsSwitch(int choice, Calculator ph) {
		switch (choice) {
		case 1:
			System.out.println("Enter a : ");
			a = sc.nextDouble();
			System.out.println("Enter b : ");
			b = sc.nextDouble();
			result = ph.topla(a, b);
			System.out.println("Result : " + result);
			break;
		case 2:
			System.out.println("Enter a : ");
			a = sc.nextDouble();
			System.out.println("Enter b : ");
			b = sc.nextDouble();
			result = ph.chix(a, b);
			System.out.println("Result : " + result);
			break;
		case 3:
			System.out.println("Enter a : ");
			a = sc.nextDouble();
			System.out.println("Enter b : ");
			b = sc.nextDouble();
			result = ph.vur(a, b);
			System.out.println("Result : " + result);
			break;
		case 4:
			System.out.println("Enter a : ");
			a = sc.nextDouble();
			System.out.println("Enter b : ");
			b = sc.nextDouble();
			result = ph.bol(a, b);
			System.out.println("Result : " + result);
			break;

		}
	}

	public static void performeIphone(int choice, Iphone ip) {
		commonMethodsSwitch(choice, ip);
		switch (choice) {
		case 5:
			ip.callIphone();
			break;
		case 6:
			System.out.println("Enter a : ");
			a = sc.nextDouble();
			result = ip.triple(a);
			System.out.println("Result : " + result);
			break;
		}
		System.out.println("Do you want to continue in iphone calculator ?\n1-yes\n2-no");
		repeat = sc.nextInt();
		if (repeat == 1) {
			ip.showCalculatorMethods();
			System.out.print("Choice : ");
			int secim = sc.nextInt();
			performeIphone(secim, ip);
		} else {

			System.out.println("Do you want to create another calculator ?\n1-yes\n2-no");
			repeat = sc.nextInt();
			if (repeat == 1) {
				Menu.menu();
				int secim = sc.nextInt();
				callSwitch(secim);
			} else {
				System.out.println("Successfully exited !");
			}
		}
	}

	public static void performeSamsung(int choice, Samsung sm) {
		commonMethodsSwitch(choice, sm);
		switch (choice) {
		case 5:
			sm.callSamsung();
			break;
		case 6:
			System.out.println("Enter base : ");
			a = sc.nextDouble();
			System.out.println("Enter power : ");
			b = sc.nextDouble();
			result = sm.power(a, b);
			System.out.println("Result : " + result);
			break;
		}
		System.out.println("Do you want to continue in samsung calculator ?\n1-yes\n2-no");
		repeat = sc.nextInt();
		if (repeat == 1) {
			sm.showCalculatorMethods();
			System.out.print("Choice : ");
			int secim = sc.nextInt();
			performeSamsung(secim, sm);
		} else {

			System.out.println("Do you want to create another calculator ?\n1-yes\n2-no");
			repeat = sc.nextInt();
			if (repeat == 1) {
				Menu.menu();
				int secim = sc.nextInt();
				callSwitch(secim);
			} else {
				System.out.println("Successfully exited !");
			}
		}
	}

	public static void performeNokia(int choice, Nokia nk) {
		commonMethodsSwitch(choice, nk);
		switch (choice) {
		case 5:
			nk.callNokia();
			break;
		case 6:
			System.out.println("Enter a : ");
			a = sc.nextDouble();
			result = nk.factorial(a);
			System.out.println("Result : " + result);
			break;
		}
		System.out.println("Do you want to continue in nokia calculator ?\n1-yes\n2-no");
		repeat = sc.nextInt();
		if (repeat == 1) {
			nk.showCalculatorMethods();
			System.out.print("Choice : ");
			int secim = sc.nextInt();
			performeNokia(secim, nk);
		} else {

			System.out.println("Do you want to create another calculator ?\n1-yes\n2-no");
			repeat = sc.nextInt();
			if (repeat == 1) {
				Menu.menu();
				int secim = sc.nextInt();
				callSwitch(secim);
			} else {
				System.out.println("Successfully exited !");
			}
		}

	}

	public static void performeLg(int choice, Lg lg) {
		commonMethodsSwitch(choice, lg);
		switch (choice) {
		case 5:
			lg.callLg();
			break;
		case 6:
			System.out.println("Enter number : ");
			a = sc.nextDouble();
			boolean expression = lg.isSimple(a);
			System.out.println("Result : " + expression);
			break;
		}
		System.out.println("Do you want to continue in lg calculator ?\n1-yes\n2-no");
		repeat = sc.nextInt();
		if (repeat == 1) {
			lg.showCalculatorMethods();
			System.out.print("Choice : ");
			int secim = sc.nextInt();
			performeLg(secim, lg);
		} else {

			System.out.println("Do you want to create another calculator ?\n1-yes\n2-no");
			repeat = sc.nextInt();
			if (repeat == 1) {
				Menu.menu();
				int secim = sc.nextInt();
				callSwitch(secim);
			} else {
				System.out.println("Successfully exited !");
			}
		}
	}

}
