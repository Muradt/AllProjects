package phone;

import calculator.Calculator;

public class Lg implements Calculator {

	public boolean isSimple(double a) {
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

	public void callLg() {
		System.out.println("It is Lg !");
	}

	public void showCalculatorMethods() {
		Calculator.super.showCalculatorMethods();
		System.out.println("\n5.callLg\n6.isSimple");

	}

}
