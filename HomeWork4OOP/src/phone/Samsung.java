package phone;

import calculator.Calculator;

public class Samsung implements Calculator {

	@Override
	public void showCalculatorMethods() {
		Calculator.super.showCalculatorMethods();
		System.out.println("\n5.callSamsung\n6.power");

	}

	public double power(double a, double b) {
		double result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

	public void callSamsung() {
		System.out.println("It is Samsung !");
	}

}
