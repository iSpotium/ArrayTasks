package by.epam.arrOfArr.main;

import java.util.Random;

public class ArrOfArrTask05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[][] arr = new int[6][3];

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
		
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.printf("{%1d} - ", i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}

	}
}