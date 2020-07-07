package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx {
	
	public static void main(String args[]) {
		arraySorting();
	}

	public static void testArray() {

		int[] array1 = new int[10];
		System.out.print("Before initialization ");
		for (int value : array1) {
			System.out.print(value + " ");
		}

		for (int i = 0; i < 10; i++) {
			array1[i] = i;
		}

		System.out.print("\nAfter initialization ");
		for (int value : array1) {
			System.out.print(value + " ");
		}
	}

	public static void arraySorting() {
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		int[] arr1 = {13,7,6,45,21};

		Arrays.sort(arr);
		System.out.printf("Modified arr[] : %s\n", Arrays.toString(arr));
		Arrays.sort(arr1, 0, 3);
		System.out.printf("Modified arr1[] : %s\n", Arrays.toString(arr1));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.printf("descending sorted arr[] : %s\n", Arrays.toString(arr));
	}
}
