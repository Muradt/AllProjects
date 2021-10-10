package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Person {
	private int ID;
	private String name;
	private String surName;
	private int age;


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static List<List<Person>> getPersonsCategory() throws IOException {
		List<Person> allPersons = FileUtility.read();
		List<Person> childs = new ArrayList<>();
		List<Person> youngs = new ArrayList<>();
		List<Person> middles = new ArrayList<>();
		List<Person> olds = new ArrayList<>();
		List<List<Person>> resultList = new ArrayList<>();
	

		
		for (int i = 0; i < allPersons.size(); i++) {
			if (allPersons.get(i).getAge() > 0 && allPersons.get(i).getAge() < 12) {
				childs.add(allPersons.get(i));
			} else if (allPersons.get(i).getAge() > 12 && allPersons.get(i).getAge() <= 18) {
				youngs.add(allPersons.get(i));
			} else if (allPersons.get(i).getAge() > 18 && allPersons.get(i).getAge() <= 40) {
				middles.add(allPersons.get(i));
			} else if (allPersons.get(i).getAge() > 40 && allPersons.get(i).getAge() <= 90) {
				olds.add(allPersons.get(i));
			}
		}
		resultList.add(childs);
		resultList.add(youngs);
		resultList.add(middles);
		resultList.add(olds);

		return resultList;

	}


}
