package phone;

import calculator.Calculator;

public class Nokia implements Calculator {

	public double factorial(double a) {
		if (a != 1)
			return a * factorial(a - 1);
		else
			return a;
	}

	public void callNokia() {
		System.out.println("It is Nokia !");
	}

	@Override
	public void showCalculatorMethods() {
		Calculator.super.showCalculatorMethods();
		System.out.println("\n5.callNokia\n6.facrtorial");

	}

}
