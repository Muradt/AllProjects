package main2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {

	private static final String FILE_PATH = "C:\\Users\\hp\\Desktop/List_Folder";
	private static final String PATH_TO_ARRAYS12 = FILE_PATH + File.separator + "arrays12.txt";
	private static final String PATH_TO_ARRAYS3 = FILE_PATH + File.separator + "arrays3.txt";
	private static final String PATH_TO_ARRAYS4 = FILE_PATH + File.separator + "arrays4.txt";
	private static File f = new File(FILE_PATH);

	public static void writeArray12intoFile(List<Integer> p, boolean a) throws IOException {
		if (!f.exists()) {
			f.mkdir();
		}
		FileWriter fw = new FileWriter(PATH_TO_ARRAYS12, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			for (int i = 0; i < p.size(); i++) {
			if (i == (p.size() - 1))
				bw.write(""+p.get(i));
			else
				bw.write(p.get(i) + "&&");

			}
			bw.newLine();

		}

	}

	public static List<Integer> readArray12() throws IOException {
		try (FileReader fr = new FileReader(PATH_TO_ARRAYS12); BufferedReader reader = new BufferedReader(fr);) {
			List<Integer> listOfNumbers = new ArrayList<>();

			while (reader.ready()) {
				String arr[] = reader.readLine().split("&&");
				for (int i = 0; i < arr.length; i++) {
					listOfNumbers.add(Integer.parseInt(arr[i]));
				}

			}
			return listOfNumbers;

		}

	}

	public static void writeArray3intoFile(List<Integer> p, boolean a) throws IOException {
		if (!f.exists()) {
			f.mkdir();
		}
		FileWriter fw = new FileWriter(PATH_TO_ARRAYS3, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			for (int i = 0; i < p.size(); i++) {
				if (i == (p.size() - 1))
					bw.write(""+p.get(i));
				else
					bw.write(p.get(i) + "&&");

			}

		}

	}

	public static List<Integer> readArray3() throws IOException {
		try (FileReader fr = new FileReader(PATH_TO_ARRAYS3); BufferedReader reader = new BufferedReader(fr);) {
			List<Integer> listOfNumbers = new ArrayList<>();

			while (reader.ready()) {
				listOfNumbers.add(Integer.parseInt(reader.readLine()));

			}
			return listOfNumbers;

		}

	}

	public static void writeArray4intoFile(List<Integer> p, boolean a) throws IOException {
		if (!f.exists()) {
			f.mkdir();
		}
		FileWriter fw = new FileWriter(PATH_TO_ARRAYS4, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			for (int i = 0; i < p.size(); i++) {
				if (i == (p.size() - 1))
					bw.write(""+p.get(i));
				else
					bw.write(p.get(i) + "&&");

			}

		}

	}

	public static List<Integer> readArray4() throws IOException {
		try (FileReader fr = new FileReader(PATH_TO_ARRAYS4); BufferedReader reader = new BufferedReader(fr);) {
			List<Integer> listOfNumbers = new ArrayList<>();

			while (reader.ready()) {
				listOfNumbers.add(Integer.parseInt(reader.readLine()));

			}
			return listOfNumbers;

		}

	}

}
