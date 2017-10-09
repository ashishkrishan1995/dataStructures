import java.io.*;
import java.util.*;

public class bubble_sort {

	// function that takes in the array, and a boolean variable to decide whether to sort in ascending or decending order
	public static int[] bubbleSort(int[] array, boolean ascending) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length - i - 1; j++) {
				if(ascending) {
					if(array[j+1]<array[j]) {
						// swaping the implaced array elements
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
				else {
					if(array[j+1]>array[j]) {
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
		}
		return array;
	}

	// function for printing the sorted array
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the array of elements: ");
		String[] inputArray = input.readLine().split(" ");
		int[] integerArray = new int[inputArray.length];

		System.out.print("Do you want to sort in Ascending order?(Yes/No): ");
		String choice = input.readLine();

		boolean ascending;

		// ask the user whether the array is to be sorted in ascending or descending order
		if(choice.contains("Yes") || choice.contains("yes")) {
			ascending = true;
		}
		else {
			ascending = false;
		}
		
		// convert the string input array into integer array
		for(int i=0; i<inputArray.length; i++) {
			integerArray[i] = Integer.parseInt(inputArray[i]);
		}

		// call the bubble sort function and print the sorted array
		integerArray = bubbleSort(integerArray, ascending);
		printArray(integerArray);
	}
}