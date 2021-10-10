import java.util.Scanner;

public class ReverseNumber {
	static int reverse = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.print("Please enter number : ");
		number = sc.nextInt();
		
// First way

//		while (number  != 0) {
//			int remainder= number % 10;
//			reverse = reverse * 10 + remainder;  
//			number = number/10;
//		}
//		System.out.println("The reverse of "+number +" is " + reverse);
		
// Second way
//		for (; number != 0; number /= 10) {
//			int remainder = number % 10;
//			reverse = reverse * 10 + remainder;
//		}
//		System.out.println("The reverse of " + number + " is " + reverse);
		sc.close();
		reverse(number);
		System.out.println("The reverse of " + number + " is " + reverse);

	}
// Third way
	public static int reverse(int num) {
		int remainder = num % 10;
		reverse = reverse * 10 + remainder;
		num=num/10;
		if(num!=0) {
			reverse(num);
		}
		return reverse;

	}
// Fourth way
	public static void reverse2(int num) {
		System.out.print(num%10);
		reverse2(num/10);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
