package az.company.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import az.company.members.Tyutor;

public class FileUtility {
	private static final String FILE_PATH = "C:\\Users\\hp\\Desktop/Student_Grades";
	private static File f = new File(FILE_PATH);

	private static final String PATH = FILE_PATH + f.separator + "grades.txt";

	public static void writeintoFile(String text, boolean a) throws Exception {
		f.mkdir();
		FileWriter fw = new FileWriter(PATH, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(text);
			bw.newLine();
		}
		System.out.println("Successfully Done !");

	}

	public static List<String> read() throws Exception {
		try (InputStream in = new FileInputStream(PATH);
				InputStreamReader r = new InputStreamReader(in);
				BufferedReader reader = new BufferedReader(r);) {
			List<String> arr = new ArrayList<>();
			while (reader.ready()) {

				arr.add(reader.readLine());

			}
			return arr;

		}

	}

}
