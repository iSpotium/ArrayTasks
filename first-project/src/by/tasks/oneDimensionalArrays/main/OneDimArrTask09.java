package by.tasks.oneDimensionalArrays.main;

import java.util.Arrays; // Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Random;

public class OneDimArrTask09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] arr = new int[6];
		int max;
		int min;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(99);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}
		System.out.println();
		System.out.println();

		min = arr[0];
		max = arr[0];
		int indMin = 0;
		int indMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				if (min == arr[i]) {
					indMin = i;
				}
			}
			if (arr[i] > max) {
				max = arr[i];
				if (max == arr[i]) {
					indMax = i;
				}
			}
		}
		System.out.printf("[%2d] - ", arr[indMin]);
		System.out.println("index min element " + indMin);
		System.out.printf("[%2d] - ", arr[indMax]);
		System.out.println("index max element " + indMax);
		System.out.println();
		int temp = arr[indMin];
		arr[indMin] = arr[indMax];
		arr[indMax] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}
	}
}
