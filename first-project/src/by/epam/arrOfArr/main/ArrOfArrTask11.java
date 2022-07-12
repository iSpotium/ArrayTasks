package by.epam.arrOfArr.main;

import java.util.Random;

public class ArrOfArrTask11 {

	public static void main(String[] args) {
		Random rand = new Random();
		int m = rand.nextInt(6) + 1;
		int n = rand.nextInt(6) + 1;
		int arr[][] = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(9);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
			i++;
			if(i >= arr.length) {
				break;
			}
			
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
