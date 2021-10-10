package calculator;

public interface Calculator {

	public default double topla(double a, double b) {
		return a + b;
	}

	public default double chix(double a, double b) {
		return a - b;
	}

	public default double vur(double a, double b) {
		return a * b;
	}

	public default double bol(double a, double b) {
		return a / b;
	}

	public default void showCalculatorMethods() {
		System.out.print("1.topla\n2.chix\n3.vur\n4.bol");
	}
}
