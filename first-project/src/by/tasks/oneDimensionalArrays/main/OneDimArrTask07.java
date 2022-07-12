package by.tasks.oneDimensionalArrays.main;

import java.util.Random;

public class OneDimArrTask07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] arr = new int[7];
		int z = 22;
		int replacement = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(99);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				replacement++;

			} else if (arr[1] <= z) {
				arr[i] = arr[i];
			}
			System.out.printf("[%2d]", arr[i]);

		}
		System.out.println(" / replacement= " + replacement);
	}
}
