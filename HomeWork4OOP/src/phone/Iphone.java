package phone;

import calculator.Calculator;

public class Iphone implements Calculator {

	public double triple(double a) {
		return a * a * a;
	}

	public void callIphone() {
		System.out.println("It is iphone !");
	}

	public void showCalculatorMethods() {
		Calculator.super.showCalculatorMethods();
		System.out.println("\n5.callIphone\n6.triple");

	}

}
