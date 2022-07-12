package by.epam.arrOfArr.main;

import java.util.Random;

public class ArrOfArrTask10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int arr[][] = new int[4][6];
		int k = 2;
		int p = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Row 'k'");

		for (int j = 0; j < arr[k].length; j++) {
			System.out.printf("[%2d]", arr[k - 1][j]);
		}

		System.out.println();
		System.out.println("Colum 'p'");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i][p - 1]);
		}
		
	}
}