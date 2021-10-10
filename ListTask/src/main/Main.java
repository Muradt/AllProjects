package main;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int numberOfPersons;
		System.out.println("1.Write 2.Read 3.Exit");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("How many people will you enter ? ");
			numberOfPersons = sc.nextInt();
			for (int i = 0; i < numberOfPersons; i++) {
				Person p = new Person();
				System.out.println("Enter name : ");
				String name = sc.next();
				sc.nextLine();
				System.out.println("Enter name : ");
				String surName = sc.next();
				System.out.println("Enter age : ");
				int age = sc.nextInt();

				p.setName(name);
				p.setSurName(surName);
				p.setAge(age);
				FileUtility.writePersonintoFile(p, true);
				System.out.println("Successfully Done !");

			}
			break;
		case 2:
			List<List<Person>> resultList = Person.getPersonsCategory();
			
			System.out.println("Childs");
            for(Person p : resultList.get(0)) {
            	System.out.println("Name : "+p.getName());
            	System.out.println("SurName : "+p.getSurName());
            	System.out.println("Age : "+p.getAge());
            	
            }
            System.out.println("Youngs");
            for(Person p : resultList.get(1)) {
            	System.out.println("Name : "+p.getName());
            	System.out.println("SurName : "+p.getSurName());
            	System.out.println("Age : "+p.getAge());
            	
            }
            System.out.println("Middles");
            for(Person p : resultList.get(2)) {
            	System.out.println("Name : "+p.getName());
            	System.out.println("SurName : "+p.getSurName());
            	System.out.println("Age : "+p.getAge());
            	
            }
            System.out.println("Olds");
            for(Person p : resultList.get(3)) {
            	System.out.println("Name : "+p.getName());
            	System.out.println("SurName : "+p.getSurName());
            	System.out.println("Age : "+p.getAge());
            	
            }
			System.out.println("Number of Children : " + resultList.get(0).size());
			System.out.println("Number of Youngs : " + resultList.get(1).size());
			System.out.println("Number of Middles : " + resultList.get(2).size());
			System.out.println("Number of Olds : " + resultList.get(3).size());
			break;
		case 3:
			System.out.println("Successfully exited !");
			return;

		}

		main(args);
	}


 
}
