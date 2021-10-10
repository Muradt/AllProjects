package tasks;
import java.util.Scanner;

public class Task3 {
//	Klavaturtadan 3 eded daxil edirsen .a,b,c. Eger (a+b)/c<10 capa verirsenki a ile b-nin ceminin c -ye bolunmesi 10-dan kicikdir , eger (a+b)/c=10  capa verirsenki a ile b-nin ceminin c -ye bolunmesi 10-a beraberdir , eger (a+b)/c>10  capa verirsenki a ile b-nin ceminin c -ye bolunmesi 10-dan boyukdur.
//			A=5
//			B=4
//			C=3
//			5 ile 4-un cemi 3-e bolunmesi 10 dan kicikdir.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a-ni daxil edin :");
		int a = sc.nextInt();
		System.out.println("b-ni daxil edin :");
		int b =sc.nextInt();
		System.out.println("c-ni daxil edin :");
		int c= sc.nextInt();
		if(c==0) {
			System.err.println("0-a bolmek olmaz !!!");
		}
		else if(((a+b)/c)<10) {
			System.out.println("a ile b nin ceminin c ye bolunmesi 10 dan kicikdir");
		}
		else if(((a+b)/c)>10) {
			System.out.println("a ile b nin ceminin c ye bolunmesi 10 dan boyukdur");
		}
		else {
			System.out.println("a ile b nin ceminin c ye bolunmesi 10 a beraberdir");
		}
		sc.close();

	}

}
