package tasks;

import java.util.Scanner;

public class Task1 {

//	Kvadrat tənliyi hesablayan proqram yazın.Verilenləri klaviaturadan daxil edin ,yeni(Scanner)
//	ax2+bx+c = 0
//	D = b2 – 4ac
//	X1,2 = -b +- sqrt(D)/2*a 

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a, b, c, discriminant;
		System.out.print("Zehmet olmasa a-ni daxil edin : ");
		a = sc.nextInt();
		System.out.print("Zehmet olmasa b-ni daxil edin : ");
		b = sc.nextInt();
		System.out.print("Zehmet olmasa c-ni daxil edin : ");
		c = sc.nextInt();
		System.out.println("Tenlik : " + a + "x2+" + b + "x+" + c + "=0");
		if (a == 0) {
			System.out.println("Bu kvadrat tenlik deyil !");
			return;
		}
		discriminant = b * b - 4 * a * c;
		if (discriminant < 0) {
			System.out.println("Tenliyin koku yoxdur !");
		} else if (discriminant == 0) {
			System.out.println("Tenliyin bir  ve ya 2 eyni koku var !");
			double X;
			X = (double) -b / (2 * a);
			System.out.println("X = " + X);
		} else {
			System.out.println("Tenliyin iki muxtelif koku var !");
			double X1, X2;
			X1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			X2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("X1 = " + X1);
			System.out.println("X2 = " + X2);
		}
		sc.close();
	}
 
}
