package main2;


import java.util.List;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		List<Integer> arr1 = null;
		List<Integer> arr2 = null;
		
		int number;
		System.out.print("Number of randoms in Lists : ");
		number = sc.nextInt();

		arr1=Method.addAndReturn(Method.generateRandomNumbers(number));
		arr2=Method.addAndReturn(Method.generateRandomNumbers(number));
		System.out.println("arr1");
		Method.print(arr1);

		System.out.println("-----------------");
		System.out.println("arr2");
		Method.print(arr2);
		System.out.println("-----------------");
		List<Integer> result = Method.retain(arr1, arr2);
		System.out.println("result");
		for (Integer i : result) {
			System.out.println(i);
		}

		int[] minAndMax = Method.findMinAndMax(result);
		System.out.println("Maximum : " + minAndMax[0]);
		System.out.println("Minimum : " + minAndMax[1]);

	}


}