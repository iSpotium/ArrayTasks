package by.epam.arrOfArr.main;

import java.util.Random;

public class ArrOfArrTask06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(20);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 0; j < arr[0].length; j = j + 2) {
			if (arr[0][j] > arr[arr.length - 1][j]) {
				for (int i = 0; i < arr.length; i++) {
					System.out.printf("[%1d]\n", arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}