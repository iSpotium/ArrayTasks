package by.epam.arrOfArr.main;

import java.util.Random;

public class ArrOfArrTask02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int arr[][] = new int[2][3];

		for (int p = 0; p < arr.length; p++) {
			for (int j = 0; j < arr[p].length; j++) {
				arr[p][j] = rand.nextInt(9);
			}
		}
		for (int p = 0; p < arr.length; p++) {
			for (int j = 0; j < arr[p].length; j++) {
				System.out.printf("[%1d]", arr[p][j]);
			}
			System.out.println();
		}
	}
}
