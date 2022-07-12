package by.epam.arrOfArr.main;

import java.util.Scanner;

public class ArrOfArrTask15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc = new Scanner(System.in);

		int n;
		System.out.print("Enter an even number n> ");
		n = sc.nextInt();

		int[][] arr = new int[n][n];


		System.out.println();

		int element = n + 1;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					temp++;
					arr[i][j] = element - temp;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%1d]", arr[i][j]);
			}
			System.out.println();
		}

	}
}
