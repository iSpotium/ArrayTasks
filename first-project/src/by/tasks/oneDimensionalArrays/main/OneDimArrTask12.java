package by.tasks.oneDimensionalArrays.main;

import java.util.Random;

public class OneDimArrTask12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int arr[] = new int[13];
		int sum = 0;
		int num;
		int flag;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%1d]", arr[i]);
		}
		System.out.println();

		for (int i = 2; i < arr.length; i++) {
			flag = 1;
			num = i;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					flag = 0;
				}
			}
			if (flag == 1) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
	}
}
