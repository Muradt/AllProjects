package main;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator App !");
		try {
			PerformeTask.startProgram();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

}
