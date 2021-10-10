import java.util.Scanner;

public class FindSimpleNumCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a : ");
        int a = sc.nextInt();
        System.out.println("Please enter a : ");
        int b = sc.nextInt();
        if(a>b) {
        	a=a+b;
        	b=a-b;
        	a=a-b;
        }
        for (int j = a; j < b; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {

				if (j % i == 0) {

					count++;
				}

			}
			if (count > 2) {
				System.out.println(j+" Murekkeb ededdir !");
			} else {
				System.out.println(j+" Sade ededdir !");
			}
		}
	}
}
