package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[5];
		strings[0] = "0";
		strings[1] = "1";
		strings[2] = "2";
		strings[3] = "3";
		strings[4] = "4";
		printStr(strings);
		printStR(strings);
		printStrAR(strings);
		printStrEO(strings);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public static void printStr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void printStR(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int coop = i - arr.length;
			int bcoop = coop - (coop * 2);
			System.out.println(arr[bcoop - 1]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printStrEO(String[] arr) {
		System.out.println("Hello?");
		for (int i = 0; i < arr.length; i = i + 2) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void printStrAR(String[] arr) {
		int[] taken = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean isTaken = false;
			int[] possi = new int[arr.length];
			for (int j = 0; j < possi.length; j++) {
				possi[j] = j;
			}
			Random a = new Random();
			int rr = a.nextInt(arr.length);
			for (int j = 0; j < taken.length; j++) {
				if (taken[j] == rr) {
					isTaken = true;
				}
			}
			if (isTaken == true) {
				rr = 0;
				for (int j = 0; j < taken.length; j++) {
					if (taken[j] != rr) {
						isTaken = false;
					}
				}

				while (isTaken = true) {
					for (int j = 0; j < taken.length; j++) {
						rr++;
						if (taken[j] != rr) {
							isTaken = false;
						}
					}
				}
				System.out.println("Ran");
				System.out.println(arr[possi[rr]]);
				taken[i] = rr;
			}
		}
	}

}
