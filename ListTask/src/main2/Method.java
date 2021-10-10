package main2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Method {
	public static Random r = new Random();
	public static Scanner sc = new Scanner(System.in);

	public static List<Integer> addAndReturn(int[] numbers) {

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			arr.add(numbers[i]);
		}
		return arr;
	}

	public static int[] generateRandomNumbers(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = 1 + r.nextInt(100);
		}
		return arr;
	}

	public static int[] enterWithScanner(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Eded daxil edin : ");
			int number = sc.nextInt();
			arr[i] = number;
		}
		return arr;
	}

	public static List<Integer> sum(List<Integer> l1, List<Integer> l2) {

		List<Integer> result = new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		if (l1.size() > l2.size()) {
			int difference = l1.size() - l2.size();
			for (int i = 0; i < difference; i++) {
				l2.add(0);
			}

		} else if (l1.size() < l2.size()) {
			int difference = l2.size() - l1.size();
			for (int i = 0; i < difference; i++) {
				l1.add(0);
			}
		}
		for (int i = 0; i < l1.size(); i++) {
			result.add(l1.get(i) + l2.get(i));
		}
		return result;

	}
	public static List<Integer> sum2(List<Integer> l1, List<Integer> l2) {

		List<Integer> result = new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		if (l1.size() > l2.size()) {
			int difference = l1.size() - l2.size();
			newList= l1.subList(l1.size()-difference, l1.size());
			for (int i = 0; i < l2.size(); i++) {
				result.add(l1.get(i) + l2.get(i));
			}
			result.addAll(newList);

		} else if (l1.size() < l2.size()) {
			int difference = l2.size() - l1.size();
			newList= l2.subList(l2.size()-difference, l2.size());
			for (int i = 0; i < l1.size(); i++) {
				result.add(l1.get(i) + l2.get(i));
			}
			result.addAll(newList);
		}
		return result;

	}

	public static List<Integer> difference(List<Integer> l1, List<Integer> l2) {

		List<Integer> result = new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		if (l1.size() > l2.size()) {
			int difference = l1.size() - l2.size();
			for (int i = 0; i < difference; i++) {
				l2.add(0);
			}

		} else if (l1.size() < l2.size()) {
			int difference = l2.size() - l1.size();
			for (int i = 0; i < difference; i++) {
				l1.add(0);
			}
		}
		for (int i = 0; i < l1.size(); i++) {
			result.add(l1.get(i) - l2.get(i));
		}
		return result;
	}
	
	public static List<Integer> difference2(List<Integer> l1, List<Integer> l2) {

		List<Integer> result = new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		if (l1.size() > l2.size()) {
			int difference = l1.size() - l2.size();
			newList= l1.subList(l1.size()-difference, l1.size());
			for (int i = 0; i < l2.size(); i++) {
				result.add(l1.get(i) - l2.get(i));
			}
			result.addAll(newList);

		} else if (l1.size() < l2.size()) {
			int difference = l2.size() - l1.size();
			newList= l2.subList(l2.size()-difference, l2.size());
			for (int i = 0; i < l1.size(); i++) {
				result.add(l1.get(i) - l2.get(i));
			}
			result.addAll(newList);
		}
		return result;

	}

	public static List<Integer> retain(List<Integer> l1, List<Integer> l2) {
		List<Integer> retainList = new ArrayList<>();

		for (int i = 0; i < l1.size(); i++) {
			if (contain(l2, l1.get(i)))
				retainList.add(l1.get(i));
		}
		return retainList;
	}

	public static boolean contain(List<Integer> list, Integer number) {
		boolean a = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == number)
				a = true;

		}

		return a;

	}

	public static int[] findMinAndMax(List<Integer> list) {
		int min = list.get(0);
		int max = list.get(0);
		int[] result = new int[2];
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min)
				min = list.get(i);
			if (list.get(i) > max)
				max = list.get(i);
		}
		result[0] = max;
		result[1] = min;
		return result;

	}

	public static void print(List<Integer> list) {
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
