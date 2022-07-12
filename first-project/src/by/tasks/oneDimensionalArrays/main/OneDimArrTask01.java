package by.tasks.oneDimensionalArrays.main;

import java.util.Random;

public class OneDimArrTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[6];
		Random rand = new Random();
		int k = 2;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			A[i] = rand.nextInt(999);
			System.out.printf("[%3d]", A[i]);
		}
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			if (A[i] % k == 0) {
				sum = sum + A[i];
			}
			System.out.println("sum = " + sum);
		}
	}
}
