package by.epam.arrOfArr.main;

import java.util.Scanner;

public class ArrOfArrTask12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc = new Scanner(System.in);
		
		int n;
		System.out.print("n>");
		n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		int element = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (i == j) {
					element++;
					arr[i][j] = element + arr[i][j];
				}
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}