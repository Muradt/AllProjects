package tasks;

import java.util.Scanner;

public class Task4 {

//	4 eded daxil edin.ilk ikisi arasindan max, ikinci ikisi arasinda min tapib,onlarin hasilini hesablayin  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, num4, maxBetweenFirstTwo = 0, minBetweenFirstTwo = 0, productOfMinAndMax;
		System.out.print("Please enter num1 : ");
		num1 = sc.nextDouble();
		System.out.print("Please enter num2 : ");
		num2 = sc.nextDouble();
		System.out.print("Please enter num3 : ");
		num3 = sc.nextDouble();
		System.out.print("Please enter num4 : ");
		num4 = sc.nextDouble();
		maxBetweenFirstTwo = (num1>num2)? num1 : num2;
		minBetweenFirstTwo = (num3 < num4)? num3 : num4;
		productOfMinAndMax = minBetweenFirstTwo * maxBetweenFirstTwo;
		System.out.println("The max of " + num1 + " and " + num2 + " is " + maxBetweenFirstTwo);
		System.out.println("The min of " + num3 + " and " + num4 + " is " + minBetweenFirstTwo);
		System.out.println("Their product is " + productOfMinAndMax);
		sc.close();

	}

}
