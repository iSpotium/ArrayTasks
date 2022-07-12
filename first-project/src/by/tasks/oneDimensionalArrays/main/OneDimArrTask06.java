package by.tasks.oneDimensionalArrays.main;

import java.util.Random;
import java.util.Arrays;

public class OneDimArrTask06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); // с помощью сортировки пузырьком.
		int[] arr = new int[7];
		int min = 0, max = 0;
		int minLength;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(99);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}
		System.out.println();
		System.out.println();

		boolean Sorted = false;
		while (!Sorted) {
			Sorted = true;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					Sorted = false;
					min = arr[0];
					max = arr[6];
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		minLength = max - min;
		System.out.println();
		System.out.println("minLength= " + minLength);
	}
}