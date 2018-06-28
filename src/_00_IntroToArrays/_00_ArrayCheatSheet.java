package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] StringArray = new String[5];
		for (int i = 0; i < StringArray.length; i++) {
			StringArray[i] = "a";
		}
		//2. print the third element in the array
			System.out.println(StringArray[3]);
		//3. set the third element to a different value
			StringArray[3] = "ab";
		//4. print the third element again
			System.out.println(StringArray[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
			for (int i = 0; i < StringArray.length; i++) {
				StringArray[i] = "b";
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
			for (int i = 0; i < StringArray.length; i++) {
				System.out.println(StringArray[i]);
			}
		//7. make an array of 50 integers
			int[] intArray = new int[50]; 
		//8. use a for loop to make every value of the integer array a random number
			Random a = new Random();
			for (int i = 0; i < intArray.length; i++) {
				intArray[i] = a.nextInt(50);
			}
		//9. without printing the entire array, print only the smallest number on the array
			int si = 50;
			int li = 0;
			for (int i = 0; i < intArray.length; i++) {
				if(intArray[i] < si) {
					si = intArray[i];
				
					
				}
			
			}
			System.out.println(si);
		//10 print the entire array to see if step 8 was correct
			for (int i = 0; i < intArray.length; i++) {
				System.out.println(intArray[i]);
			}
		//11. print the largest number in the array.
			for (int i = 0; i < intArray.length; i++) {
				if(intArray[i] > li) {
					li = intArray[i];
				}
			}
			System.out.println(li);
		//12. print only the last element in the array
		System.out.println(intArray[intArray.length-1]);
	}
}
