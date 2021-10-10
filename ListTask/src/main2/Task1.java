package main2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		List<Integer> arr1 = null;
		List<Integer> arr2 = null;
		List<Integer> arr3 = null;
		List<Integer> arr4 = null;

		int size1,size2;
		System.out.print("Numbers in List 1: ");
		size1 = sc.nextInt();
		System.out.print("Numbers in List 2: ");
		size2 = sc.nextInt();

		arr1 = Method.addAndReturn(Method.generateRandomNumbers(size1));
		arr2 = Method.addAndReturn(Method.enterWithScanner(size2));
		System.out.println("arr1");
		Method.print(arr1);

		System.out.println("-----------------");
		System.out.println("arr2");
		Method.print(arr2);
		FileUtility.writeArray12intoFile(arr1, true);
		FileUtility.writeArray12intoFile(arr2, true);

		arr3 = Method.sum2(arr1, arr2);
		arr4 = Method.difference2(arr1, arr2);
		System.out.println("-----------------");
		System.out.println("arr3");
		Method.print(arr3);
		System.out.println("-----------------");
		System.out.println("arr4");
		Method.print(arr4);
		FileUtility.writeArray3intoFile(arr3, true);
		FileUtility.writeArray4intoFile(arr4, true);
		System.out.println("Successfully done !");

	}

}
