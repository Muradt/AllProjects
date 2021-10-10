package main;

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
	private static final String PATH_TO_GRADE = FILE_PATH + File.separator + "persons.txt";
	private static File f = new File(FILE_PATH);

	public static void writePersonintoFile(Person p, boolean a) throws IOException {
		if (!f.exists()) {
			f.mkdir();
		}
		FileWriter fw = new FileWriter(PATH_TO_GRADE, a);
		try (BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(p.getName() + "--" + p.getSurName() + "--" + p.getAge());
			bw.newLine();
		}

	}

	public static List<Person> read() throws IOException {
		try (FileReader fr = new FileReader(PATH_TO_GRADE); BufferedReader reader = new BufferedReader(fr);) {
			List<Person> listOfPersons = new ArrayList<>();

			while (reader.ready()) {

				Person st = new Person();
				String[] arr = reader.readLine().split("--");
				st.setName(arr[0]);
				st.setSurName(arr[1]);
				st.setAge(Byte.parseByte(arr[2]));
				listOfPersons.add(st);

			}
			return listOfPersons;

		}

	}

}
