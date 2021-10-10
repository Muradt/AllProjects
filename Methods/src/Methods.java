import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Methods {
	
//	1. ele bir method yaradinki bu method iki setr arasinda en uzun setri qaytarsin
	public static String findMaxLength(String a, String b) {
		if (a.length() > b.length())
			return a;

		else if (a.length() == b.length()) {
			return null;
		} else
			return b;
	}

//	2.ele bir method yaradinki bu method daxil edilmis setirdeki bosluqlarin sayini qaytarsin
	public static int findSpaceCount(String a) {

		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				count++;
			}
		}
		return count;

	}

//	3. ele bir method yaradinki bu method daxil
//	edilmis setirde en uzun sozu qaytarsin nezere 
//	alin ki daxil edilmis setirde sozler probel ile ayrilmisdir
	public static String longestWord(String x) {
		String[] s1 = x.split(" ");
		String max = s1[0];
		for (int i = 0; i < s1.length; i++) {

			if (max.length() <= s1[i].length()) {
				max = s1[i];
			}
		}
		return max;
	}

//	4. ele bir method yaradinki bu method
//	daxil edilmis heqiqi edeler massivindeki
//	elementlerin cemini qaytarsin
	public static double maximumNumber(double[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

//	5. ele bir method yaradinki
//	bu method daxil edilmis setrler
//	massivinden qosa saitli sozleri qaytarsin
	public static String[] findDipthongWords(String[] a) {
		String[] arr = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			if (findAdjacentTwoVowels(a[i])) {
				arr[i] = a[i];
			}
		}
		return arr;
	}

	private static boolean findAdjacentTwoVowels(String a) {

		for (int i = 1; i < a.length() - 1; i++) {
			if (findVowels(a.charAt(i))) {
				if (a.charAt(i) == a.charAt(i + 1))
					return true;
			}
		}

		return false;

	}

	private static boolean findVowels(char a) {

		String vowels = "aioueAIOUE";
		for (int i = 0; i < vowels.length(); i++) {
			if (a == vowels.charAt(i))
				return true;
		}
		return false;
	}

	private static boolean findCons(char a) {

		String consonants = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXMCNVB";
		for (int i = 0; i < consonants.length(); i++) {
			if (a == consonants.charAt(i))
				return true;
		}
		return false;
	}

//	6. ele bir method yaradinki bu
//	method daxil edilmis setrdeki
//	saitlerin sayini qaytarsin
	public static int numberOfVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
					|| s.charAt(i) == 'e') {
				count++;
			}
		}
		return count;
	}

// 7.ele bir method yaradinki bu method esil azerbaycan soyadlarini qaytarsin;
	public static boolean realAzerbaijaniSurNames(String str) {
		String[] surnames = { "ov", "ova", "yev", "yeva", "lı", "li", "lu", "lü", "zadə" };
		for (int i = 0; i < surnames.length; i++) {
			if (str.endsWith(surnames[i]))
				return true;
		}

		return false;
	}

// 8.ele bir method yaradinki bu method kvadrat tenliyin hellini qaytarsin - neticesini
	public static double[] solveQuadraticEquision(double a, double b, double c) {
		double[] answers = new double[3];
		if (a == 0) {
			throw new ArithmeticException("A 0 ola bilmez !");
		}
		double discriminant = findDiscriminant(a, b, c);
		if (discriminant < 0) {
			answers[2] = -1;
			return answers;
		} else if (discriminant == 0) {

			answers[0] = findOneX(a, b);

			return answers;
		} else {

			answers[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
			answers[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
			return answers;
		}

	}

	private static double findDiscriminant(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	private static double findOneX(double a, double b) {
		return -b / (2 * a);
	}

//9.Ele bir method yaradinki bu method setirdeki saitlerin ve samitlerin sayi qaytarsin
	public static int[] countOfVowelsAndConsonants(String str) {
		int numOfCons = 0, numOfVowel = 0;
		int[] arr = new int[2];
		for (int i = 0; i < str.length(); i++) {
			if (findVowels(str.charAt(i)))
				numOfVowel++;
			if (findCons(str.charAt(i)))
				numOfCons++;

		}
		arr[0] = numOfVowel;
		arr[1] = numOfCons;
		return arr;

	}

//10.Ele bir method yaradinki bu method daxil edilmis setirler massivindeki en uzun setri qaytarsin
	public static String findLongestString(String[] arr) {
		String max = " ";
		for (int i = 0; i < arr.length; i++) {
			if (max.length() < arr[i].length())
				max = arr[i];
		}
		return max;
	}

//11.Ele bir method yaradinki bu method daxil edilmish setrler massivinden terkibinde 
//iki saitden cox olan  sozleri qaytarsin
	public static String[] wordswithMoreThTwoVowel(String[] arr) {
		String[] result = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (findVowels(arr[i].charAt(j)))
					count++;
			}
			if (count > 2)
				result[i] = arr[i];
		}
		return result;
	}

	
	
}
