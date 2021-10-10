package tasks;
import java.util.Scanner;

public class Task1 {
//	4 eded goturulur. Eger 1 –ci eded ile 2-ci ededin cemi , 3 cu eded ile 4 –cu ededin ceminden boyukdurse,onda asagidaki kimi hell etmeli.
//	Lazim olan butun sertler yoxlanilmalidir.
//	A = 20;
//	B=10;
//	C=30;
//	D=40;
//
//	20 ile 10-un cemi 30 ile 40-in ceminden kicikdir.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Please enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Please enter num3 : ");
		int num3 = sc.nextInt();
		System.out.print("Please enter num4 : ");
		int num4 = sc.nextInt();

		if (num1 + num2 > num3 + num4) {
			System.out.println(num1 + " ile " + num2 + " nin cemi " + num3 + " ile " + num4 + " un ceminden boyukdur");
		}
		else if(num1 + num2 == num3 + num4) {
			System.out.println(num1 + " ile " + num2 + " nin cemi " + num3 + " ile " + num4 + " un cemine beraberdir");
		}
		else {
			System.out.println(num1 + " ile " + num2 + " nin cemi " + num3 + " ile " + num4 + " un ceminden kicikdir");
		}

	}

}
