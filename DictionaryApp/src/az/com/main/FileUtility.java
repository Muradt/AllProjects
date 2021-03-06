package az.com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtility {
	private static final String PATH_TO_ADMIN_LOGINS = "C:\\Users\\hp\\Desktop\\DictionarySystem\\AdminLoginParol.txt";
	private static final String PATH_TO_USER_LOGINS = "C:\\Users\\hp\\Desktop\\DictionarySystem\\UserLoginParol.txt";
	private static final String PATH_TO_DICTIONARIES = "C:\\Users\\hp\\Desktop\\DictionarySystem\\Dictionaries.txt";

	public static void writeAdminLoginsintoFile(String adminUserName, String adminPassword, boolean a)
			throws IOException {

		FileWriter fw = new FileWriter(PATH_TO_ADMIN_LOGINS, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(adminUserName + "&&" + adminPassword);
			bw.newLine();
		}

	}

	public static List<String[]> readAdminLogins() throws IOException {
		try (FileReader fr = new FileReader(PATH_TO_ADMIN_LOGINS); BufferedReader reader = new BufferedReader(fr);) {
			List<String[]> adminLogins = new ArrayList<>();

			while (reader.ready()) {
				String[] line = reader.readLine().split("&&");
				adminLogins.add(line);
			}
			return adminLogins;

		}
	}

	public static void writeUserLoginsintoFile(String userUserName, String userPassword, boolean a) throws IOException {

		FileWriter fw = new FileWriter(PATH_TO_USER_LOGINS, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(userUserName + "&&" + userPassword);
			bw.newLine();
		}

	}

	public static List<String[]> readUserLogins() throws IOException {
		try (FileReader fr = new FileReader(PATH_TO_USER_LOGINS); BufferedReader reader = new BufferedReader(fr);) {
			List<String[]> userLogins = new ArrayList<>();

			while (reader.ready()) {
				String[] line = reader.readLine().split("&&");
				userLogins.add(line);
			}
			return userLogins;

		}
	}

	public static void writeWordsintoDictionary(String language1, String language2, String word1, String word2,
			boolean a) throws IOException {

		FileWriter fw = new FileWriter(
				"C:\\Users\\hp\\Desktop\\DictionarySystem\\" + language1 + "-" + language2 + ".txt", a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(word1 + "-" + word2);
			bw.newLine();
		}

	}

	public static Map<String, String> readWordsfromDictionary(String language1, String language2) throws IOException {
		try (FileReader fr = new FileReader(
				"C:\\Users\\hp\\Desktop\\DictionarySystem\\" + language1 + "-" + language2 + ".txt");
				BufferedReader reader = new BufferedReader(fr);) {
			Map<String, String> dictionary = new HashMap<>();
			while (reader.ready()) {
				String[] line = reader.readLine().split("-");
				dictionary.put(line[0], line[1]);
			}
			return dictionary;
		}

	}

	public static Map<String, String> readWordsfromDictionary(String language1, String language2, int dicType)
			throws IOException {
		try (FileReader fr = new FileReader(
				"C:\\Users\\hp\\Desktop\\DictionarySystem\\" + language1 + "-" + language2 + ".txt");
				BufferedReader reader = new BufferedReader(fr);) {
			Map<String, String> dictionary = new HashMap<>();
			String[] line = null;
			while (reader.ready()) {
				if (dicType == 1) {
					line = reader.readLine().split("-");
					dictionary.put(line[0], line[1]);
				} else if (dicType == 2) {
					line = reader.readLine().split("-");
					dictionary.put(line[1], line[0]);
				}
				else {
					System.out.println("Invalid Dictionary type !");
					break;
				}
			}
			return dictionary;
		}

	}

	public static void writeDictionaryintoFile(String language1, String language2, boolean a) throws IOException {

		FileWriter fw = new FileWriter(PATH_TO_DICTIONARIES, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(language1 + "-" + language2);
			bw.newLine();
		}

	}

	public static List<String> readDictionaryfromFile() throws IOException {
		try (FileReader fr = new FileReader(PATH_TO_DICTIONARIES); BufferedReader reader = new BufferedReader(fr);) {
			List<String> dictionaries = new ArrayList<>();
			while (reader.ready()) {
				dictionaries.add(reader.readLine());
			}
			return dictionaries;
		}

	}

}
