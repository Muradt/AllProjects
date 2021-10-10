import java.util.Scanner;

public class Task5 {
//	5. ele bir method yaradinki
//	bu method daxil edilmis setrler
//	massivinden qosa saitli sozleri qaytarsin
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("How many String do you want to enter ? ");
//		int num = sc.nextInt();
//		String[] words = new String[num];
//		for (int i = 0; i < words.length; i++) {
//			System.out.println("Please enter "+(i+1)+"'s element : ");
//			sc.nextLine();
//			words[i] = sc.nextLine();
//		}
		String words[] = { "murad salam", "mrw sla", "aa dd" };
		System.out.println("words with two vowel : ");
		String[] x = foo(words);
		for (int i = 0; i < x.length; i++) {
			if (x[i] == null) {
				return;
			}
			System.out.println(x[i]);

		}

	}

	public static String[] foo(String[] a) {
		String[] wordsWithtwoVowel = new String[20];
		int cn = 0;
		for (int i = 0; i < a.length; i++) {
			String[] d = a[i].split(" ");

			for (int j = 0; j < d.length; j++) {
				int count = 0;
				for (int y = 0; y < d[j].length(); y++) {
					if (d[j].charAt(y) == 'a' || d[j].charAt(y) == 'i' || d[j].charAt(y) == 'o' || d[j].charAt(y) == 'u'
							|| d[j].charAt(y) == 'e') {
						count++;
					}
				}
				if (count == 2) {
					wordsWithtwoVowel[cn] = d[j];
					cn++;
				}
			}
		}
		return wordsWithtwoVowel;
	}
}
