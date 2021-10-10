package tasks;

import java.util.Scanner;

public class Task8 {
//	Klaviaturadan daxil edilmish 2 deyishenin qiymetlerinin 3 deyishen istifade etmemek shertile yerdeyishmesi.
//	Mes: Ilkin verilenler -  a = 5 , b = 7 , Alinan netice a = 7 , b = 5

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Zehmet olmasa a-ni daxil edin : ");
		a = sc.nextInt();
		System.out.print("Zehmet olmasa b-ni daxil edin : ");
		b = sc.nextInt();
		System.out.println("a : "+a+" b : "+b);
		
		// a=5 b=7
		a=a+b;
		// a=12 b=7
		b=a-b;
		// a=12 b=5
		a=a-b;
		// a=7 b=5
		System.out.println("a : "+a+" b : "+b);
		sc.close();

	}

}
