package az.com.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Method {

	public static void startProgram() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter as \n1.Admin\n2.User ");
		System.out.println("Choice : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			if (checkAdminUserNameAndPassword(enterUserNameAndPassword(1))) {
				showExistingDictionaries();
				showMenu();
				callSwitchAdmin();

			} else {
				System.err.println("Incorrect user name or password !");
			}

			break;
		case 2:
			if (Method.checkUserUserNameAndPassword(Method.enterUserNameAndPassword(2))) {
				callSwitchUser();
			} else {
				System.err.println("Incorrect user name or password !");
			}

			break;
		default:
			System.out.println("Invalid option !");
		}
		startProgram();

	}

	public static String[] enterUserNameAndPassword(int choice) {
		Scanner sc = new Scanner(System.in);
		String[] nameAndPassword = new String[2];
		if (choice == 1) {
			System.out.println("Enter Admin user name :");
			String userName = sc.next();
			sc.nextLine();
			System.out.println("Enter Admin password :");
			String password = sc.next();
			nameAndPassword[0] = userName;
			nameAndPassword[1] = password;

			return nameAndPassword;
		} else {
			System.out.println("Enter User user name :");
			String userName = sc.next();
			sc.nextLine();
			System.out.println("Enter User password :");
			String password = sc.next();
			nameAndPassword[0] = userName;
			nameAndPassword[1] = password;

			return nameAndPassword;
		}
	}

	public static boolean checkAdminUserNameAndPassword(String[] nameAndPassword) throws Exception {
		List<String[]> adminLogins = FileUtility.readAdminLogins();
		boolean a = false;

		for (int i = 0; i < adminLogins.size(); i++) {

			if (adminLogins.get(i)[0].equalsIgnoreCase(nameAndPassword[0])
					&& adminLogins.get(i)[1].equals(nameAndPassword[1])) {
				a = true;
			}
		}

		return a;

	}

	public static void showExistingDictionaries() throws IOException {
		System.out.println("Existing Dictionaries : ");
		List<String> dictionaries = FileUtility.readDictionaryfromFile();
		for (int i = 0; i < dictionaries.size(); i++) {
			System.out.println((i + 1) + "." + dictionaries.get(i));
		}
		System.out.println("-------------------");
	}

	public static void showMenu() {
		System.out.println("1.Add new dictionary\n" + "2.Update existing dictionary\n" + "3.Delete Dictionary\n"
				+ "4.Add new admin\n" + "5.Add new User");
		System.out.print("Choice : ");
	}

	public static void callSwitchAdmin() throws IOException {
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			addNewDictionary();
			break;
		case 2:
			updateDictionary();
			break;
		case 3:
			deleteDictionary();
			break;
		case 4:
			addNewAdminOrUser(1);
			break;
		case 5:
			addNewAdminOrUser(2);
			break;
		default:
			System.out.println("Invalid Option !!!");
		}
	}

	public static void callSwitchUser() throws IOException {
		Scanner sc = new Scanner(System.in);
		showExistingDictionaries();
		System.out.println("Choice : (write the name of dictionary)");
		String dcName = sc.next();
		System.out.println("Translate from 1." + dcName.split("-")[0] + " to " + dcName.split("-")[1] + " or 2.from "
				+ dcName.split("-")[1] + " to " + dcName.split("-")[0]);
		System.out.print("Choice : ");
		int ch = sc.nextInt();
		Map<String, String> dictionary = FileUtility.readWordsfromDictionary(dcName.split("-")[0], dcName.split("-")[1],
				ch);
		if (ch == 1)
			System.out.println("Enter the " + dcName.split("-")[0] + " word :");
		else
			System.out.println("Enter the " + dcName.split("-")[1] + " word :");
		String word = sc.next();
		String result = dictionary.get(word);
		if (result != null)
			System.out.println("Result : " + result);
		else
			System.out.println("No information !");
	}

	public static void addNewDictionary() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter languages : (Azerbaijani-English or Russian-Turkish)");
		System.out.print("From ");
		String first = sc.next();
		sc.nextLine();
		System.out.print("To ");
		String second = sc.next();
		System.out.println("How Many word will you enter to the dictionary ? ");
		int number;
		System.out.print("Number : ");
		number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter " + first + " word");
			String word1 = sc.next();
			System.out.println("Enter " + second + " word");
			String word2 = sc.next();
			FileUtility.writeWordsintoDictionary(first, second, word1, word2, true);
		}
		FileUtility.writeDictionaryintoFile(first, second, true);
		System.out.println("Successfully done !!!");
	}

	public static void updateDictionary() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which dictionary ? ");
		String dcName = sc.next();
		System.out.println("1.Add word\n2.Delete word\n3.Change Word");
		System.out.print("Choice : ");
		int ch = sc.nextInt();
		if (ch == 1) {
			addNewWord(dcName);
		} else if (ch == 2) {
			deleteWord(dcName);
		} else if (ch == 3) {
			changeWord(dcName);
		} else
			System.out.println("Invalid Option !!!");
	}

	public static void deleteDictionary() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which dictionary ? ");
		String dcname = sc.next();
		File f = new File("C:\\Users\\hp\\Desktop\\DictionarySystem\\" + dcname.split("-")[0] + "-"
				+ dcname.split("-")[1] + ".txt");
		f.delete();
		deleteDictionaryNamefromFile(dcname);
		System.out.println("Successfully done !!!");
	}

	public static void addNewAdminOrUser(int choice) throws IOException {
		Scanner sc = new Scanner(System.in);
		if (choice == 1) {
			System.out.println("Enter new Admin username : ");
			String newAdminUserName = sc.next();
			sc.nextLine();
			System.out.println("Enter new Admin password : ");
			String newAdminPassword = sc.next();
			FileUtility.writeAdminLoginsintoFile(newAdminUserName, newAdminPassword, true);
			System.out.println("Successfully done !!!");
		} else if (choice == 2) {
			System.out.println("Enter new User username : ");
			String newUserUserName = sc.next();
			sc.nextLine();
			System.out.println("Enter new User password : ");
			String newUserPassword = sc.next();
			FileUtility.writeUserLoginsintoFile(newUserUserName, newUserPassword, true);
			System.out.println("Successfully done !!!");
		} else {
			System.out.println("Invalid option !!!");
		}

	}

	public static void addNewWord(String dcName) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many new word will you enter to the dictionary ? ");
		int count;
		System.out.print("Number : ");
		count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter " + dcName.split("-")[0] + " word");
			String word1 = sc.next();
			System.out.println("Enter " + dcName.split("-")[1] + " word");
			String word2 = sc.next();
			FileUtility.writeWordsintoDictionary(dcName.split("-")[0], dcName.split("-")[1], word1, word2, true);
		}
		System.out.println("Successfully done !!!");
	}

	public static void deleteWord(String dcName) throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<String, String> dictionary = FileUtility.readWordsfromDictionary(dcName.split("-")[0],
				dcName.split("-")[1]);
		System.out.println("Enter the " + dcName.split("-")[0] + " word to delete it");
		String word = sc.next();
		dictionary.remove(word);
		List<String> keyList = new ArrayList<>();
		keyList.addAll(dictionary.keySet());
		List<String> values = new ArrayList<>();
		values.addAll(dictionary.values());
		for (int i = 0; i < dictionary.size(); i++) {
			if (i == 0) {
				FileUtility.writeWordsintoDictionary(dcName.split("-")[0], dcName.split("-")[1], keyList.get(i),
						values.get(i), false);
			} else {
				FileUtility.writeWordsintoDictionary(dcName.split("-")[0], dcName.split("-")[1], keyList.get(i),
						values.get(i), true);
			}
		}
		System.out.println("Successfully done !!!");
	}

	public static void changeWord(String dcName) throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<String, String> dictionary = FileUtility.readWordsfromDictionary(dcName.split("-")[0],
				dcName.split("-")[1]);
		System.out.println("Enter the " + dcName.split("-")[0] + " word to update it's translation");
		String word = sc.next();
		sc.nextLine();
		System.out.println("Enter new Translation : ");
		String newTr = sc.next();
		dictionary.put(word, newTr);
		List<String> keyList = new ArrayList<>();
		keyList.addAll(dictionary.keySet());
		List<String> values = new ArrayList<>();
		values.addAll(dictionary.values());
		for (int i = 0; i < dictionary.size(); i++) {
			if (i == 0) {
				FileUtility.writeWordsintoDictionary(dcName.split("-")[0], dcName.split("-")[1], keyList.get(i),
						values.get(i), false);
			} else {
				FileUtility.writeWordsintoDictionary(dcName.split("-")[0], dcName.split("-")[1], keyList.get(i),
						values.get(i), true);
			}
		}
		System.out.println("Successfully done !!!");
	}

	public static boolean checkUserUserNameAndPassword(String[] nameAndPassword) throws Exception {
		List<String[]> userLogins = FileUtility.readUserLogins();
		boolean a = false;

		for (int i = 0; i < userLogins.size(); i++) {

			if (userLogins.get(i)[0].equalsIgnoreCase(nameAndPassword[0])
					&& userLogins.get(i)[1].equals(nameAndPassword[1])) {
				a = true;
			}
		}

		return a;

	}

	public static void deleteDictionaryNamefromFile(String dcName) throws IOException {
		List<String> dictionaries = FileUtility.readDictionaryfromFile();
		dictionaries.remove(dictionaries.indexOf(dcName));
		for (int i = 0; i < dictionaries.size(); i++) {
			if (i == 0) {
				FileUtility.writeDictionaryintoFile(dictionaries.get(i).split("-")[0],
						dictionaries.get(i).split("-")[1], false);
			} else {
				FileUtility.writeDictionaryintoFile(dictionaries.get(i).split("-")[0],
						dictionaries.get(i).split("-")[1], true);
			}
		}

	}

}
