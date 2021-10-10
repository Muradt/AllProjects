package stringtasks;

import java.util.Scanner;

public class Task3 {
//	Cümlə daxil edin. Əgər cümlə saitlə başlayıb,
//	samitlə bitirsə cümlədə sözlərin yerini simmetrik dəyişin.
//	(məsələn:saitlə başlayıb samitlə bitirsə 1-ci və 4-cü sözün
//	,2-ci ilə 3-cü sözün yerini dəyişin).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String : ");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		String Vowels = "aioueAIOUE";
		boolean v = false, c = false;
		String Consonants = "qwrtyplkjhgfdszxcvbnmQWRTYPLKJHGFDSZXCVBNM";
		for (int i = 0; i < Consonants.length(); i++) {
			if (i < Vowels.length() && s.charAt(0) == Vowels.charAt(i)) {
				v = true;
			}
			if (s.charAt(s.length() - 1) == Consonants.charAt(i)) {
				c = true;
			}
		}
		String[] arr2 = new String[arr.length];
		if (v == true && c == true) {

			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[arr.length - 1 - i];

			}
		}
		String newString = "";
		for (int i = 0; i < arr2.length; i++) {
			newString += arr2[i] + " ";
		}
		System.out.println(newString);
		sc.close();

	}
}
