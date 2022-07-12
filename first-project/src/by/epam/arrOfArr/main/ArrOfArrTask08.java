package by.epam.arrOfArr.main;

import java.util.Random;

public class ArrOfArrTask08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int arr[][] = new int[10][10];

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

		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 7) {
					value++;
				}
			}
		}
		System.out.println("number 7 occurs " + value + " times");
	}
}
