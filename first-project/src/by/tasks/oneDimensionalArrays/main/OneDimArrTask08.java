package by.tasks.oneDimensionalArrays.main;

import java.util.Random;

public class OneDimArrTask08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] arr = new int[6];
		int pos = 0;
		int neg = 0;
		int zero = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			if (rand.nextInt(1000) % 3 == 0) {
				arr[i] = -arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos++;
			} else if (arr[i] < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		System.out.println("pos = " + pos + "\t neg = " + neg + "\t zero = " + zero);
	}

}
