package stringtasks;

import java.util.Scanner;

public class Task2 {
//	Her hansi bir cumle daxil edilecek.Hemin cumlede 
//	olan samitlerin sayini tapmaq teleb olunur.
//	Ve hemin samitlerin yerlesdiyi index-lerin cemini tapmaq teleb olunur.
//	Daxil edilmis cumlede daha cox samit olan soz cap edilsin 
//	ve oradaki samitlerin sayi cap edilsin.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfConsonant = 0, sumOfConsIndex = 0;
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		String consonants = "qwrtyplkjhgfdszxcvbnmQWRTYPLKJHGFDSZXCVBNM";

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < consonants.length(); j++) {
				if (s.charAt(i) == consonants.charAt(j)) {

					numOfConsonant++;
					sumOfConsIndex += i;

				}
			}
		}
		int a = 0, a1 = 0;
		String word="";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				for (int k = 0; k < consonants.length(); k++) {
					if (arr[i].charAt(j) == consonants.charAt(k)) {

						a++;

					}
				}
				
			}
			if (a > a1) {
				a1 = a;
				word = arr[i];
			}

			a = 0;

		}
		System.out.println("Number of Consonants : " + numOfConsonant);
		System.out.println("Num of Their indexs : " + sumOfConsIndex);
		System.out.println("--------------------------------------");
		System.out.println("The Word which contains most consonants : "+word);
		System.out.println("Number of cons in this word : "+a1);
		sc.close();
	}
}
