package by.epam.arrOfArr.main;

import java.util.Random;

public class ArrOfArrTask04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int[][] arr = new int[7][5];

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
		System.out.println("--------------------");

		for (int str: arr[0]) {
			System.out.printf("[%2d]", str);
			}
			System.out.println();
			
			System.out.println("--------------------");
			for (int str: arr[arr.length - 1]) {
				System.out.printf("[%2d]", str);
		}
			System.out.println();
	}
}